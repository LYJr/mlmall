package com.mlmall.appapi.service;

import com.mlmall.appcommon.repository.OrderFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 거니 코로나 확진 기념
public class OrderFormService {

    @Autowired
    private OrderFormRepository repository;

    /**
     * 1. 주문서 폼 작성 ( 주문번호 있어야함. 폼 이미지, 폼 제목, 판매일정, 배송일정, 판매국가, 태그?, 결제수단 선택할수있게)
     * 2. 판매 아이템 내역 작성 ( 아이템 이미지, 작품명, 판매가, 재고 수량, 구매개수제한, 상세 정보)
     * 3. 배송 폼 작성 ( 무료배송, 고정배송, 조건부 무료배송, 구매 갯수 별 차등 배송, 구매자 맞춤 배송 중 선택)
     *          - 도서/산간/제주 추가 배송비 필요함.
     * 4, 환불/교환 안내
     *
     * @param orderItem
     */

    /**
     *     repo 대용
     *     userId를 id로 검색할 수 있도록 2중 List에는 완성된 주문서가 들어감.
     */

    Map<String, OrderForms> repo = new HashMap();

    public void 주문서_작성(OrderItemDto orderItem) {
        String userId = orderItem.getUserId();

        OrderForms orderForm = new OrderForms();
        orderForm.settingItem(orderItem);

        repository.save(orderForm);
    }

    @Transactional
    //트랜젝션 끝날 때 save문 안하고 업데이트 하는 방법 있나? 테스트 해보기.
    public void 주문서_수정(Long id, OrderItemDto orderItem) {
        OrderForm orderForm = repository.findById(id);
        orderForm.updateOrderItem(orderItem);
    }

    public OrderForm 주문서_조회(String 주문번호) {
        OrderForm orderForm = repository.findByOrderId(주문번호);
        return OrderForm;
    }

    //특정 상태값에 따른 조회 방법 추가해야함.
    public List<OrderForm> 내_주문서_리스트_조회(Long id) {
        OrderForm orderForm = repository.findAllByUserId(id);
        return OrderForm;
    }

    @Transactional
    public void 주문서_삭제(String 주문번호, String 상태값) {
        OrderForm orderForm = repository.findByOrderId(주문번호);
        orderForm.settingState(상태값);
    }
}
