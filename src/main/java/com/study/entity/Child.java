package com.study.entity;

import jakarta.persistence.*;

@Entity
public class Child {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;


}
