package com.six.ms.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "ms.message_type")
public class MessageType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "message_type")
    @Enumerated(EnumType.STRING)
    private MessageSendType messageType;

    private int price;

}

enum MessageSendType {
    SMS, LMS, MMS
}
