package com.dhsk.backend.backend.repository;

import com.dhsk.backend.backend.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
  List<Permission> findPermissionByRole(String role);
}
