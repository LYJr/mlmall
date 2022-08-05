package com.mlmall.appcommon.repository;

import com.mlmall.appcommon.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
