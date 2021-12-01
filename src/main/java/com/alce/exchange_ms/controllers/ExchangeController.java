package com.alce.exchange_ms.controllers;

import com.alce.exchange_ms.exceptions.ExchangeNotFoundException;
import com.alce.exchange_ms.models.Exchange;
import com.alce.exchange_ms.repositories.ExchangeRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

    private ExchangeRepository exchangeRepository;

    public ExchangeController(ExchangeRepository exchangeRepository) {
        this.exchangeRepository = exchangeRepository;
    }

    // create new exchange
    @PostMapping("/exchange")
    Exchange newExchange(@RequestBody Exchange exchange) {

        return exchangeRepository.save(exchange);
    }

    // get exchange
    @GetMapping("/exchange/{id}")
    Exchange getBook(@PathVariable String id) {
        return exchangeRepository.findById(id)
                .orElseThrow(() -> new ExchangeNotFoundException("No se encontró ningún intercambio"));
    }

    // delete exchange
    @PutMapping("/exchange/{id}")
    Exchange updateExchange(@PathVariable String id, @RequestBody Exchange exchange) {
        exchangeRepository.findById(id)
                .orElseThrow(() -> new ExchangeNotFoundException("No se encontró ningún intercambio"));
        return exchangeRepository.save(exchange);
    }

}
