package com.mlmall.appcommon.repository;

import com.mlmall.appcommon.domain.OrderForms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderFormRepository extends JpaRepository<OrderForms, Long> {
}
