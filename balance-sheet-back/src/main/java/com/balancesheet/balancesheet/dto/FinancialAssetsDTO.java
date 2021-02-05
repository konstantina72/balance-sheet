package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class FinancialAssetsDTO {

  private String id;
  private double loansAndReceivables;
  private double heldToMaturityInvestments;
  private double particInterestsInSubsAssJointVent;
  private double availableForSaleFinancialAssets;
  private double assetsIntendedToHedging;

}
