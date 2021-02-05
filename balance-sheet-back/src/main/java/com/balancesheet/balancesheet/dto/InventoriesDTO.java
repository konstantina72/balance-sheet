package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class InventoriesDTO {

  private String id;
  private double finishedSemiFinishedProducts;
  private double merchandise;
  private double rawMaterialsConsumables;
  private double biologicalAssets;
  private double paymentsOnAccountForInventories;
  private double otherInventories;

}
