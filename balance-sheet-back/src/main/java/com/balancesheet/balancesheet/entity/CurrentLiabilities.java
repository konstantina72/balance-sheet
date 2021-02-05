package com.balancesheet.balancesheet.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "CURRENT_LIABILITIES")
@Getter
@Setter
public class CurrentLiabilities {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name = "short_term_bank_loans")
  private double shortTermBankLoans;

  @Column(name = "current_portion_double_term_debt")
  private double currentPortiondoubleTermDebt;

  @Column(name = "trade_payables")
  private double tradePayables;

  @Column(name = "income_tax")
  private double incomeTax;

  @Column(name = "other_taxes_and_duties")
  private double otherTaxesAndDuties;

  @Column(name = "social_security_organizations")
  private double socialSecurityOrganizations;

  @Column(name = "loans_and_receivables")
  private double otherLiabilities;

  @Column(name = "accrued_expenses")
  private double accruedExpenses;

  @Column(name = "deferred_income")
  private double deferredIncome;

}
