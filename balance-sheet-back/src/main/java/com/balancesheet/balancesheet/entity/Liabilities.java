package com.balancesheet.balancesheet.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "LIABILITIES")
@Getter
@Setter
public class Liabilities {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "current_assets_id")
  private CurrentLiabilities currentLiabilities;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "nonCurrent_assets_id")
  private NonCurrentLiabilities nonCurrentLiabilities;

}
