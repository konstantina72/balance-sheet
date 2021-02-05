package com.balancesheet.balancesheet.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "INVENTORIES")
@Getter
@Setter
public class Inventories {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name = "finished_semi_finished_products")
  private double finishedSemiFinishedProducts;

  @Column(name = "merchandise")
  private double merchandise;

  @Column(name = "raw_materials_consumables")
  private double rawMaterialsConsumables;

  @Column(name = "biological_assets")
  private double biologicalAssets;

  @Column(name = "payments_on_account_for_inventories")
  private double paymentsOnAccountForInventories;

  @Column(name = "other_inventories")
  private double otherInventories;

}
