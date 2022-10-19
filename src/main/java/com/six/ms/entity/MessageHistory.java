package com.six.ms.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "ms.message_history")
public class MessageHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String success; // 성공여부 0:실패, 1:성공
    
    @Column(name = "send_count")
    private int sendCount; //전송 시도 횟수

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany
    @JoinColumn(name = "id")
    private MessageHistoryDetail detail;

}
