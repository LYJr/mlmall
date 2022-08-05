package com.mlmall.appcommon.domain;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigInteger;

@Getter
@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String phoneNumber;

    private String email;

    private BigInteger cash;

    @Embedded
    private Address address;
}
