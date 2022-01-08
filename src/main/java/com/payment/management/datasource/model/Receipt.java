package com.payment.management.datasource.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class BillingData {

    @Id
//    @SequenceGenerator()
    private long id;

    @Column
    private String service;

    @Column
    private String payer;

    @Column
    private LocalDateTime date;

    @Column
    private double price;

    @Column
    private String currency;
}
