package com.mlmall.appapi.service;

import com.mlmall.appapi.dto.member.MemberInfoRes;
import com.mlmall.appcommon.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public List<MemberInfoRes> searchMembers() {
        return MemberInfoRes.toDtos(memberRepository.findAll());
    }
}
