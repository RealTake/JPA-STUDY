package com.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders") // 'order'는 SQL 예약어이므로 'orders'로 변경
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue
    private Long orderId;

    private LocalDateTime orderDt;

    private String orderSt;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
}
