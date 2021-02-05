package com.balancesheet.balancesheet.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "TANGIBLE_ASSETS")
@Getter
@Setter
public class TangibleAssets {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name = "land_buildings")
  private double landBuildings;

  @Column(name = "mechanical_equipment")
  private double mechanicalEquipment;

  @Column(name = "other_equipment")
  private double otherEquipment;

  @Column(name = "investment_property")
  private double investmentProperty;

  @Column(name = "biological_assets")
  private double biologicalAssets;

  @Column(name = "other_tangible_assets")
  private double otherTangibleAssets;

}
