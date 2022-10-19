package com.six.ms.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "ms.payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    private long payment;

    @Enumerated(EnumType.STRING)
    private PayType type;

}

enum PayType {
    CARD, ACCOUNT
}
