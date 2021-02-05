package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class CurrentAssetsDTO {

  private String id;
  private InventoriesDTO inventories;
  private FinancialAssetsPaymentsOnAccountDTO financialAssetsPaymentsOnAccount;
}
