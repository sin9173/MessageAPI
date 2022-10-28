package com.six.ms.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Card {

    @Id
    private Long id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_year")
    private String cardYear;

    @Column(name = "card_month")
    private String cardMonth;

    @Column(name = "base_it")
    private String baseIt;
}
