package com.mlmall.appcommon.repository;

import com.mlmall.appcommon.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findAll();
    Member findById(long id);
}
