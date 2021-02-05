package com.balancesheet.balancesheet.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "NON_CURRENT_LIABILITIES")
@Getter
@Setter
public class NonCurrentLiabilities {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name="double_term_bank_loans")
  private double doubleTermBankLoans;

  @Column(name="other_non_current_liabilities")
  private double otherNonCurrentLiabilities;

  @Column(name="government_grants")
  private double governmentGrants;

  @Column(name = "deferred_taxes")
  private double deferredTaxes;

}
