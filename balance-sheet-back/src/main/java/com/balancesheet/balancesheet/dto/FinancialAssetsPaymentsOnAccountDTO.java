package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class FinancialAssetsPaymentsOnAccountDTO {

  private String id;
  private double tradeReceivables;
  private double accruedIncome;
  private double otherReceivables;
  private double tradingPortfolio;
  private double prepaidExpenses;
  private double cashAndCashEquivalents;

}
