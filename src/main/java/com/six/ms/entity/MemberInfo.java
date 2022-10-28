package com.six.ms.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class MemberInfo {

    @Id
    private Long id;

    private String name;

    private String company_name;
}
