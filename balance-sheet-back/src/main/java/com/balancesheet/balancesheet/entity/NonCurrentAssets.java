package com.balancesheet.balancesheet.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "NON_CURRENT_ASSETS")
@Getter
@Setter
public class NonCurrentAssets {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "tangible_assets_id")
  private TangibleAssets tangibleAssets;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "intangible_assets_id")
  private IntangibleAssets intangibleAssets;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "financial_assets_id")
  private FinancialAssets financialAssets;

  @Column(name = "pay_acc_non_cur_assets_in_course_con")
  private double payAccNonCurAssetsInCourseCon;

  @Column(name = "deferredTaxes")
  private double deferredTaxes;

}
