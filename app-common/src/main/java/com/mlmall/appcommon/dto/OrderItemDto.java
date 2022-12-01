package com.mlmall.appcommon.dto;

import com.mlmall.appcommon.domain.DefaultDate;
import com.mlmall.appcommon.domain.Default내용물;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
public class OrderItemDto {

    //판매자
    private Long memberId;

    //form 종류
    private String orderType;

    private DefaultDate date;
    //판매 폼 제목
    private Default내용물 내용물;
    //내용
    private String contents;

    //금액
    private Long amount;


}
