package com.dhsk.backend.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity(name = "permission")
public class Permission {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column
  private String role;
  @Column
  private String storeId;
  @Column
  private boolean canViewProduct;
  @Column
  private boolean canEditProduct;
  @Column
  private boolean canAddProduct;
  @Column
  private boolean hasFullPermission;
}
