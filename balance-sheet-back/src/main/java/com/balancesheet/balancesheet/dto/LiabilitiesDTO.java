package com.balancesheet.balancesheet.dto;

import lombok.Data;

@Data
public class LiabilitiesDTO {

  private String id;
  private CurrentLiabilitiesDTO currentLiabilities;
  private NonCurrentLiabilitiesDTO nonCurrentLiabilities;

}
