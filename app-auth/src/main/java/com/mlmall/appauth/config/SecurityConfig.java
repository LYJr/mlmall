package com.mlmall.appauth.config;

import com.mlmall.appcommon.enums.Role;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.ignoring().antMatchers("/resources/**");
    }

    /**
     * antMatchers = 경로
     * csrf = Cross site Request forgery 의도치 않은 위조 요청을 보내는것을 의미.
     * frameOptions =  보안 헤더 설정
     * authorizeRequests = Security 처리에 HttpServletRequest 를 이용.
     * authenticated = 인증된 사용자만 접근 가능
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.csrf().disable()
                .headers()
                    .frameOptions().disable()
                .and()
                    .authorizeRequests()
                    .antMatchers("/user/**").authenticated()
                    .antMatchers("/admin/**").hasAnyRole(Role.SELLER.name(), Role.MANAGER.name())
                    .antMatchers("/manager/**").hasRole(Role.MANAGER.name())
                    .anyRequest().permitAll()
                .and()
                .build();
    }
}
