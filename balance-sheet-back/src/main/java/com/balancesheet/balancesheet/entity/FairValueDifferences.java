package com.balancesheet.balancesheet.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "FAIR_VALUE_DIFFERENCES")
@Getter
@Setter
public class FairValueDifferences {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name = "fair_value_diff_in_tang_assets")
  private double fairValueDifferencesInTangibleAssets;

  @Column(name = "fair_value_diff_in_avail__sale_fin_assets")
  private double fairValueDifferencesInAvailableSaleFinancialAssets;

  @Column(name = "fair_value_diff_in_cash_flow_hedg")
  private double fairValueDifferencesInCashFlowHedging;

}
