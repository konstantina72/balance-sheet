package com.balancesheet.balancesheet.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "FINANCIAL_ASSETS")
@Getter
@Setter
public class FinancialAssets {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name = "loans_and_receivables")
  private double loansAndReceivables;

  @Column(name = "held_to_maturity_investments")
  private double heldToMaturityInvestments;

  @Column(name = "partic_interests_in_subs_ass_joint_vent")
  private double particInterestsInSubsAssJointVent;

  @Column(name = "available_for_sale_financial_assets")
  private double availableForSaleFinancialAssets;

  @Column(name = "assets_intended_to_hedging")
  private double assetsIntendedToHedging;

}
