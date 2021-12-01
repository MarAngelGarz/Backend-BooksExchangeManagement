package com.alce.exchange_ms.exceptions;

public class ExchangeNotFoundException extends RuntimeException {
    public ExchangeNotFoundException(String message){
        super(message);
    }
}
