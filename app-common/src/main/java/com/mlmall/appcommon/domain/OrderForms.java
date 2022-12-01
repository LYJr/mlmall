package com.mlmall.appcommon.domain;

import com.mlmall.appcommon.dto.OrderItemDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderForms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    //지연로딩 사용.
    @ManyToOne(targetEntity = Member.class, fetch= FetchType.LAZY)
    private Long memberId;

    @Embedded
    private DefaultDate dateTime;

    @Embedded
    private Default내용물 내용물;

    private FormState state;

    // TODO: 2022/12/01 적절한 네이밍 변경할것.
    public OrderForms settingItem(OrderItemDto dto){
        this.memberId = dto.getMemberId();
        dateTime.set(dto.getDate());
        내용물.set(dto.get내용물());
    return this;
    };

}
