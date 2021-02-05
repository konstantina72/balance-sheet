package com.balancesheet.balancesheet.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "EQUITY")
@Getter
@Setter
public class Equity {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "paid_up_capital_id")
  private PaidUpCapital paidUpCapital;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "fair_value_differences_id")
  private FairValueDifferences fairValueDifferences;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "reserves_retained_earnings_id")
  private ReservesRetainedEarnings reservesRetainedEarnings;

  @Column(name = "exchange_rate_differences")
  private double exchangeRateDifferences;

}
