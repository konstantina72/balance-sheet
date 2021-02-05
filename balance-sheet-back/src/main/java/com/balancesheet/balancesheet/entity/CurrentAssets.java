package com.balancesheet.balancesheet.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "CURRENT_ASSETS")
@Getter
@Setter
public class CurrentAssets {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "inventories_id")
  private Inventories inventories;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "fin_as_pay_on_acc_id")
  private FinancialAssetsPaymentsOnAccount financialAssetsPaymentsOnAccount;

}
