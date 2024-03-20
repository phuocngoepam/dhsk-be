package com.dhsk.backend.backend.service;

import com.dhsk.backend.backend.entity.Permission;
import com.dhsk.backend.backend.repository.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StorePermissionService {

  private final PermissionRepository permissionRepository;

  public List<Permission> getPermissionByRole(String role) {
    return permissionRepository.findPermissionByRole(role);
  }
}
