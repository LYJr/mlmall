package com.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    private Long id;

    private String name;

//    @Embedded
//    private Address address;

    private String phoneNumber;

    private String email;

//    private RoleEnum role;

    private BigInteger cash;
}
