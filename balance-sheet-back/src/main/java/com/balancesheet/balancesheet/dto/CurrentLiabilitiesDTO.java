package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class CurrentLiabilitiesDTO {

  private String id;
  private double shortTermBankLoans;
  private double currentPortiondoubleTermDebt;
  private double tradePayables;
  private double incomeTax;
  private double otherTaxesAndDuties;
  private double socialSecurityOrganizations;
  private double otherLiabilities;
  private double accruedExpenses;
  private double deferredIncome;

}
