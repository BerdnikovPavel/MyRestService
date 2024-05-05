package org.example.RestService.Controller;

import org.example.RestService.Model.ClientInfo;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
public class MainController {
    @PostMapping(
            value = "/api/info/clients",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )

    public Object clientInfo(@RequestBody ClientInfo clientInfo) throws IOException {
        String clientCode = clientInfo.getClientCode();
        try {
            String url = "http://localhost:8080/api/info/clients/" + clientCode;
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.getForEntity(
                    url,
                    String.class
            );

            return response.getBody();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
