package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class AssetsDTO {

  private String id;
  private CurrentAssetsDTO currentAssets;
  private NonCurrentAssetsDTO nonCurrentAssets;

}
