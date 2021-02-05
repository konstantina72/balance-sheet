package com.balancesheet.balancesheet.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "RESERVES_RETAINED_EARNINGS")
@Getter
@Setter
public class ReservesRetainedEarnings {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name = "statutory_reserve")
  private double statutoryReserve;

  @Column(name = "tax_free_reserves")
  private double taxFreeReserves;

  @Column(name = "retained_earnings")
  private double retainedEarnings;

}
