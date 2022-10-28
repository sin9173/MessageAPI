package com.six.ms.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class SenderInfo {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "sender_tel")
    private String senderTel;

    @Column(name = "base_it")
    private String baseIt;
}
