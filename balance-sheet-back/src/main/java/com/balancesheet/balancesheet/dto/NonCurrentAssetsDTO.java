package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class NonCurrentAssetsDTO {

  private String id;
  private TangibleAssetsDTO tangibleAssets;
  private IntangibleAssetsDTO intangibleAssets;
  private FinancialAssetsDTO financialAssets;
  private double payAccNonCurAssetsInCourseCon;
  private double deferredTaxes;

}
