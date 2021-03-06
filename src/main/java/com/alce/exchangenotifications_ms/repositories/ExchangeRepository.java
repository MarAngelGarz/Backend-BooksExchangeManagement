package com.alce.exchangenotifications_ms.repositories;

import com.alce.exchangenotifications_ms.models.ExchangeNotificationRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ExchangeRepository extends MongoRepository<ExchangeNotificationRequest, Integer> {
    List<ExchangeNotificationRequest> findByIdOwner(int idOwner);
    List<ExchangeNotificationRequest> findByIdAplicant(int idAplicant);

}