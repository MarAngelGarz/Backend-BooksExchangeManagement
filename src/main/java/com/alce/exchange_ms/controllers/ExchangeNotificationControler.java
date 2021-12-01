package com.alce.exchange_ms.controllers;

import java.util.List;

import com.alce.exchange_ms.models.ExchangeNotification;
import com.alce.exchange_ms.repositories.ExchangeNotificationRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeNotificationControler {
    
    private ExchangeNotificationRepository exchangeNotificationRepository;

    public ExchangeNotificationControler(ExchangeNotificationRepository exchangeNotificationRepository) {
        this.exchangeNotificationRepository = exchangeNotificationRepository;
    }

    // create new exchange notification
    @PostMapping("/exchangeNoti")
    ExchangeNotification newExchangeNoti(@RequestBody ExchangeNotification exchangeNotification) {
        return exchangeNotificationRepository.save(exchangeNotification);
    }

    // get notifications of an exchange
    @GetMapping("/exchangeNoti/{idExchange}")
    List<ExchangeNotification> getAllNotificationsExchange(@PathVariable String idExchange) {
        return exchangeNotificationRepository.findByIdExchage(idExchange);
    }
}
