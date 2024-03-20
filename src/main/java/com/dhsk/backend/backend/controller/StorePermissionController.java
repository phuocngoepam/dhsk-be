package com.dhsk.backend.backend.controller;

import com.dhsk.backend.backend.entity.Permission;
import com.dhsk.backend.backend.service.StorePermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store-permission")
@RequiredArgsConstructor
public class StorePermissionController {

  private final StorePermissionService storePermissionService;

  @GetMapping("/{role}")
  public ResponseEntity<List<Permission>> getPermissionByRole(@PathVariable("role") String role) {

    var permission = storePermissionService.getPermissionByRole(role);
    return new ResponseEntity<>(permission, HttpStatus.OK);
  }
}
