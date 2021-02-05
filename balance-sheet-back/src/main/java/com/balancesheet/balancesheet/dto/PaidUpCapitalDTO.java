package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class PaidUpCapitalDTO {

  private String id;
  private double capital;
  private double sharePremium;
  private double ownersDeposits;
  private double ownSharesSecurities;

}
