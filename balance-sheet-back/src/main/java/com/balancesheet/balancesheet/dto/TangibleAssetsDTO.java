package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class TangibleAssetsDTO {

  private String id;
  private double landBuildings;
  private double mechanicalEquipment;
  private double otherEquipment;
  private double investmentProperty;
  private double biologicalAssets;
  private double otherTangibleAssets;

}
