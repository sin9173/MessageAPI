package com.six.ms.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ms.member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private String userId; //회원 아이디

    @Column(name = "user_pw")
    private String userPw; //회원 비밀번호

    @OneToOne
    @JoinColumn(name = "id")
    private MemberPoint memberPoint;

}
