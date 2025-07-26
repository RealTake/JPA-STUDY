package com.study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Item extends BaseEntity {
    @Id
    @GeneratedValue
    private Long itemId; // 아이템 ID

    private String itemNm; // 아이템 이름

    private String itemDesc; // 아이템 설명

    private Integer itemPrice; // 아이템 가격

    private Integer itemStock; // 아이템 재고
}
