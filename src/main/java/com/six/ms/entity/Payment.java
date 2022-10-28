package com.six.ms.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

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

    private long amount;

    @Enumerated(EnumType.STRING)
    private PayType type;

    @Column(name = "payment_date")
    private LocalDateTime paymentDate;

}

enum PayType {
    CARD, ACCOUNT
}
