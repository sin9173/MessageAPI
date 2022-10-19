package com.six.ms.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "ms.member_point")
public class MemberPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long point; //포인트
}
