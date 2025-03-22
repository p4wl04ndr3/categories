package com.github.categories.service;

import com.github.categories.model.Address;
import com.github.categories.client.ViaCepClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    private final ViaCepClient viaCepClient;

    @Autowired
    public CepService(ViaCepClient viaCepClient) {
        this.viaCepClient = viaCepClient;
    }

    public Address getAddress(String cep) {
        return viaCepClient.getAddressByCep(cep);
    }
}