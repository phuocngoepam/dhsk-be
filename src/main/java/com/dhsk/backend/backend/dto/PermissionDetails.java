package com.dhsk.backend.backend.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PermissionDetails {

  private Long id;
  private String role;
  private String storeId;
  private boolean canViewProduct;
  private boolean canEditProduct;
  private boolean canAddProduct;
  private boolean hasFullPermission;
}
