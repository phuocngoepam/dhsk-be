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


  @GetMapping("/{role}")
  public ResponseEntity<List<String>> getProductListByRole(@PathVariable("role") String role) {

    if ("admin".equals(role)) {
      return new ResponseEntity<>(List.of("7fafb33d-c6a8-4308-b456-1e4f4fec1f02",
          "f3db354d-4430-4290-bba6-cdddd3d7c713",
          "81be493d-05a5-4385-bc16-3137586fb786",
          "699c5c9f-ead0-4f05-97d3-83bac6db2e06",
          "248caf05-1544-413e-bb7e-d3b45f739c7c",
          "46d1480d-12d8-4fd5-9e93-2e8767df31a0",
          "85b5305f-dd6c-4a10-843c-4c4460c69dc8",
          "8080ee21-3cd8-4da9-882f-252c38856cfd",
          "a969df53-0ce6-4ed4-b885-264dfe99f448",
          "04751943-bd9c-4b3d-af2c-1783a132db96",
          "7a39f84c-5d05-4fb4-b272-f94f5cf309f4",
          "85302303-a64d-422a-9c35-45ce56990f26",
          "fd5f1fc9-611c-4de0-8cc3-cfd7f6cadcc7",
          "82c59913-9dca-41f6-ad82-adc51ba96c7d",
          "981b2f6a-948b-42de-b9b2-ee4094c0d693",
          "b14521fe-5951-4e6f-81c8-bfc9ae379b46",
          "e221ce4d-5487-464c-a8af-af92c3618f95",
          "268a4b79-7da7-4e11-bcec-786d0f76b7f8",
          "23bbae14-c172-4594-9a0a-30787eaa45b1",
          "1e5505c2-e351-48ba-afd6-337375ca9fee",
          "651521d9-55d7-4af6-80da-1d381edda47e",
          "fca114f2-bbf6-4ec9-9e65-6bc929c1c7a0",
          "b8f253bc-1322-4e5f-a489-5e243c37cdc6",
          "507db28c-d751-4fbc-9ead-632a1084eb81",
          "796b0336-5ab4-45a0-92e9-a6988dc8947f",
          "ac4cdec1-057c-49c6-bf52-aa721d7af088",
          "dd4c13d5-4af7-4209-a073-38036e13d25e",
          "529b9123-28c3-4551-8577-bcdf5616a2c5",
          "9dca78e0-0b61-4050-b53c-9ee9797bf393",
          "9666b9a7-a0c3-4116-99a6-7e11b880f824",
          "0677cceb-5208-4e8e-8f04-27f48e01a7ec",
          "2179ec88-f679-4259-a1cf-5adee306e82f"), HttpStatus.OK);
    } else if ("market_lead".equals(role)) {
      return new ResponseEntity<>(List.of("268a4b79-7da7-4e11-bcec-786d0f76b7f8",
          "7fafb33d-c6a8-4308-b456-1e4f4fec1f02",
          "e221ce4d-5487-464c-a8af-af92c3618f95",
          "9dca78e0-0b61-4050-b53c-9ee9797bf393",
          "f3db354d-4430-4290-bba6-cdddd3d7c713",
          "796b0336-5ab4-45a0-92e9-a6988dc8947f"), HttpStatus.OK);
    } else if ("sale".equals(role)) {
      return new ResponseEntity<>(List.of("268a4b79-7da7-4e11-bcec-786d0f76b7f8",
          "7fafb33d-c6a8-4308-b456-1e4f4fec1f02",
          "e221ce4d-5487-464c-a8af-af92c3618f95"), HttpStatus.OK);
    }
    return new ResponseEntity<>(List.of(), HttpStatus.OK);
  }
}
