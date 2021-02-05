package com.balancesheet.balancesheet.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "INTANGIBLE_ASSETS")
@Getter
@Setter
public class IntangibleAssets {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name = "development_costs")
  private double developmentCosts;

  @Column(name = "goodwill")
  private double goodwill;

  @Column(name = "otherIntangibleAssets")
  private double otherIntangibleAssets;

}
