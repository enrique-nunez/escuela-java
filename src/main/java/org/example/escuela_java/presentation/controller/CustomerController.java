package org.example.escuela_java.presentation.controller;

import lombok.RequiredArgsConstructor;
import org.example.escuela_java.presentation.dto.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    @PostMapping("/save")
    public ResponseEntity<String> registerCustomer(@RequestBody CustomerDto customerDto) throws Exception {
        CustomerDto customer = CustomerDto.builder()
                .name("Enrique")
                .address("Lioncoln 661")
                .email("enrique@gmail.com")
                .build();
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }
}
