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


  @GetMapping("/products/{role}")
  public ResponseEntity<List<String>> getProductListByRole(@PathVariable("role") String role) {

    if ("admin".equals(role)) {
      return new ResponseEntity<>(List.of("85302303-a64d-422a-9c35-45ce56990f26",
          "2d643a40-3b6d-4736-94cc-0547daf2a0c9",
          "268a4b79-7da7-4e11-bcec-786d0f76b7f8",
          "9666b9a7-a0c3-4116-99a6-7e11b880f824",
          "dd4c13d5-4af7-4209-a073-38036e13d25e",
          "85b5305f-dd6c-4a10-843c-4c4460c69dc8",
          "248caf05-1544-413e-bb7e-d3b45f739c7c"), HttpStatus.OK);
    } else if ("market_lead".equals(role)) {
      return new ResponseEntity<>(List.of("85302303-a64d-422a-9c35-45ce56990f26",
          "2d643a40-3b6d-4736-94cc-0547daf2a0c9",
          "268a4b79-7da7-4e11-bcec-786d0f76b7f8",
          "9666b9a7-a0c3-4116-99a6-7e11b880f824",
          "dd4c13d5-4af7-4209-a073-38036e13d25e",
          "85b5305f-dd6c-4a10-843c-4c4460c69dc8",
          "248caf05-1544-413e-bb7e-d3b45f739c7c"), HttpStatus.OK);
    } else if ("sale_singapore".equals(role)) {
      return new ResponseEntity<>(List.of("268a4b79-7da7-4e11-bcec-786d0f76b7f8",
          "9666b9a7-a0c3-4116-99a6-7e11b880f824",
          "85302303-a64d-422a-9c35-45ce56990f26",
          "2d643a40-3b6d-4736-94cc-0547daf2a0c9"), HttpStatus.OK);
    } else if ("sale_vietnam".equals(role)) {
      return new ResponseEntity<>(List.of("dd4c13d5-4af7-4209-a073-38036e13d25e",
          "85b5305f-dd6c-4a10-843c-4c4460c69dc8",
          "85302303-a64d-422a-9c35-45ce56990f26",
          "2d643a40-3b6d-4736-94cc-0547daf2a0c9",
          "248caf05-1544-413e-bb7e-d3b45f739c7c"), HttpStatus.OK);
    }
    return new ResponseEntity<>(List.of(), HttpStatus.OK);
  }
}
