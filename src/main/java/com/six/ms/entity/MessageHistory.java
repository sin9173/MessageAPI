package com.six.ms.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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
    @JoinColumn(name = "sender_info_id")
    private SenderInfo senderInfo;

    @Column(name = "send_date")
    private LocalDateTime sendDate;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private MessageType messageType;

    @OneToMany
    @JoinColumn(name = "mid")
    private List<MessageHistoryDetail> detail;

}
