package com.balancesheet.balancesheet.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "FINANCIAL_ASSETS_PAYMENTS_ON_ACCOUNT")
@Getter
@Setter
public class FinancialAssetsPaymentsOnAccount {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name = "trade_receivables")
  private double tradeReceivables;

  @Column(name = "accrued_income")
  private double accruedIncome;

  @Column(name = "other_receivables")
  private double otherReceivables;

  @Column(name = "trading_portfolio")
  private double tradingPortfolio;

  @Column(name = "prepaid_expenses")
  private double prepaidExpenses;

  @Column(name = "cash_and_cash_equivalents")
  private double cashAndCashEquivalents;

}
