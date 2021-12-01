package com.alce.exchange_ms.repositories;

import com.alce.exchange_ms.models.Exchange;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExchangeRepository extends MongoRepository<Exchange, String>{
    
    
}
