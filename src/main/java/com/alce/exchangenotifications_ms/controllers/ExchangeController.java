package com.alce.exchangenotifications_ms.controllers;

import com.alce.exchangenotifications_ms.exceptions.BookNotFoundException;
import com.alce.exchangenotifications_ms.models.ExchangeNotificationRequest;
import com.alce.exchangenotifications_ms.models.ExchangeNotificationResponse;
import com.alce.exchangenotifications_ms.repositories.ExchangeRepository;
import com.alce.exchangenotifications_ms.repositories.ExchangeRepositoryResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ExchangeController {

    private final ExchangeRepository exchangeRepository;
    ExchangeRepositoryResponse exchangeRepositoryResponse;

    public ExchangeController(ExchangeRepository exchangeRepository, ExchangeRepositoryResponse exchangeRepositoryResponse) {
        this.exchangeRepository = exchangeRepository;
        this.exchangeRepositoryResponse = exchangeRepositoryResponse;
    }

    @PostMapping("/exchanges/search")
    ExchangeNotificationRequest newExchange(@RequestBody ExchangeNotificationRequest exchange) {
        ExchangeNotificationRequest aplicant = exchangeRepository.findById(exchange.getIdOwner()).orElse(null);

        if (aplicant == null)
            throw new BookNotFoundException("No se encontró ningún usuario");
        if (aplicant.isRequested())
            throw new BookNotFoundException("Libro no disponible");

        aplicant.setRequested(true);
        aplicant.setDate(new Date());

        return exchangeRepository.save(aplicant);
    }

    @PostMapping("/exchanges")
    ExchangeNotificationResponse newExchange(@RequestBody ExchangeNotificationResponse exchange) {

        ExchangeNotificationResponse owner = exchangeRepositoryResponse.findById(exchange.getIdUserBookExchanged()).orElse(null);
        ExchangeNotificationResponse aplicant = exchangeRepositoryResponse.findById(exchange.getIdOwner()).orElse(null);
        if (owner == null)
            throw new BookNotFoundException("No se encontró ningún usuario");

        if (owner.isAcceptedExchange())
            throw new BookNotFoundException("Libro no disponible");

        owner.setAcceptedExchange(true);
        exchangeRepositoryResponse.save(owner);

        owner.setStatus("En intercambio");
        aplicant.setStatus("En intercambio");

        owner.setDate(new Date());
        aplicant.setDate(new Date());
        exchangeRepositoryResponse.save(owner);
        exchangeRepositoryResponse.save(aplicant);
        return owner;
    }
}

