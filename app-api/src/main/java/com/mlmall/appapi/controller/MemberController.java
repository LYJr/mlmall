package com.mlmall.appapi.controller;

import com.mlmall.appapi.dto.member.MemberInfoRes;
import com.mlmall.appapi.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/members")
@RestController
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    public List<MemberInfoRes> searchMembers() {
        return memberService.searchMembers();
    }
}
