package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class FairValueDifferencesDTO {

  private String id;
  private double fairValueDifferencesInTangibleAssets;
  private double fairValueDifferencesInAvailableSaleFinancialAssets;
  private double fairValueDifferencesInCashFlowHedging;

}
