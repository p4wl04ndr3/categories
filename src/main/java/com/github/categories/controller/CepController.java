package com.github.categories.controller;

import com.github.categories.model.Address;
import com.github.categories.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CepController {

    private final CepService cepService;

    @Autowired
    public CepController(CepService cepService) {
        this.cepService = cepService;
    }

    @GetMapping("/{cep}")
    public ResponseEntity<Address> consultCep(@PathVariable String cep) {
        Address address = cepService.getAddress(cep);
        return ResponseEntity.ok(address);
    }
}