package com.alce.exchange_ms.models;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class ExchangeNotification {

    @Id
    private String id;
    private String idExchange;
    private Date date;
    private String title;
    private String message;

    public ExchangeNotification(String id, String idExchange, Date date, String title, String message) {
        this.id = id;
        this.idExchange = idExchange;
        this.date = date;
        this.title = title;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getIdExchange() {
        return idExchange;
    }

    public void setIdExchange(String idExchange) {
        this.idExchange = idExchange;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setLikedmessage(String message) {
        this.message = message;
    }

}
