package com.balancesheet.balancesheet.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "PAID_UP_CAPITAL")
@Getter
@Setter
public class PaidUpCapital {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name = "capital")
  private double capital;

  @Column(name = "share_premium")
  private double sharePremium;

  @Column(name = "owners_deposits")
  private double ownersDeposits;

  @Column(name = "own_shares_securities")
  private double ownSharesSecurities;

}
