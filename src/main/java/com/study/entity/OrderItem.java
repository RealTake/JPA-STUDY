package com.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderItem extends BaseEntity {
    @Id
    @GeneratedValue
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order; // 주문 엔티티와 연관 관계 설정

    @OneToOne
    @JoinColumn(name = "item_id")
    private Item item; // 아이템 엔티티와 연관 관계 설정

    private Integer orderQty; // 주문 수량

    private Integer orderPrice; // 주문 가격
}
