package com.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member extends BaseEntity {
    @Id
    @GeneratedValue
    private Long memberId;

    private String name;

    private String email;

    private Integer phone;

    private String password;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
