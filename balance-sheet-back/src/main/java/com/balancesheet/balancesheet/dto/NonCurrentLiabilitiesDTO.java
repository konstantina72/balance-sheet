package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class NonCurrentLiabilitiesDTO {

  private String id;
  private double doubleTermBankLoans;
  private double otherNonCurrentLiabilities;
  private double governmentGrants;
  private double deferredTaxes;

}
