package com.alce.exchange_ms.repositories;

import com.alce.exchange_ms.models.ExchangeNotification;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ExchangeNotificationRepository extends MongoRepository<ExchangeNotification, String> {

    //List<ExchangeNotification> findByIdExchage(String idExchange);

}