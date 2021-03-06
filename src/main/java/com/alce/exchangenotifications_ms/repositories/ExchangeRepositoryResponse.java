package com.alce.exchangenotifications_ms.repositories;

import com.alce.exchangenotifications_ms.models.ExchangeNotificationResponse;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ExchangeRepositoryResponse extends MongoRepository<ExchangeNotificationResponse, Integer> {
    List<ExchangeNotificationResponse> findByIdOwner(int idOwner);
    List<ExchangeNotificationResponse> findByIdUserBookExchanged(int idUserBookExchaged);

}
