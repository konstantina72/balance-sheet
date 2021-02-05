package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class EquityDTO {

  private String id;
  private PaidUpCapitalDTO paidUpCapital;
  private FairValueDifferencesDTO fairValueDifferences;
  private ReservesRetainedEarningsDTO reservesRetainedEarnings;
  private double exchangeRateDifferences;

}
