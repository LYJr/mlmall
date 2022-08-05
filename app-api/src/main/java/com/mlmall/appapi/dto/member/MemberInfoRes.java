package com.mlmall.appapi.dto.member;

import com.mlmall.appcommon.domain.Member;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import java.math.BigInteger;
import java.util.List;

@Getter
@Builder(access = AccessLevel.PRIVATE)
public class MemberInfoRes {

    private Long id;

    private String name;

    private String phoneNumber;

    private String email;

    private BigInteger cash;

    public static List<MemberInfoRes> toDtos(List<Member> members) {
        return members.stream()
                      .map(m -> MemberInfoRes.builder()
                                             .id(m.getId())
                                             .name(m.getName())
                                             .phoneNumber(m.getPhoneNumber())
                                             .email(m.getEmail())
                                             .cash(m.getCash())
                                             .build())
                      .toList();
    }
}
