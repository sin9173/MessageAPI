package com.six.ms.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "ms.message_history_detail")
@SequenceGenerator(
        name = "MESSAGE_DETAIL_SEQ_GENERATOR",
        catalog = "ms",
        sequenceName = "MESSAGE_DETAIL_SEQ",
        initialValue = 1, allocationSize = 5
)
public class MessageHistoryDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MESSAGE_DETAIL_SEQ_GENERATOR")
    private Long id;

    @Column(name = "phone_no")
    private String phoneNo;

    private String title;

    private String content;

}
