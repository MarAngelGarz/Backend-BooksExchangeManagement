package com.alce.exchange_ms.models;

import java.util.Date;

public class ExchangeNotificationResponse {

    private int id;
    private Date date;
    private String status;
    private String acceptedMessage;
    private boolean acceptedExchange;
    private int idOwner;
    private int idUserBookExchanged;


    public ExchangeNotificationResponse(int id, Date date, String status, String acceptedMessage, boolean acceptedExchange,int idOwner, int IdUserBookExchanged) {
        this.id =id;
        this.date =date;
        this.status = status;
        this.acceptedMessage = acceptedMessage;
        this.acceptedExchange =acceptedExchange;
        this.idOwner =idOwner;
        this.idUserBookExchanged =idUserBookExchanged;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAcceptedMessage() {
        return acceptedMessage;
    }

    public void setAcceptedMessage(String acceptedMessage) {
        this.acceptedMessage = acceptedMessage;
    }

    public boolean isAcceptedExchange() {
        return acceptedExchange;
    }

    public void setAcceptedExchange(boolean acceptedExchange) {
        this.acceptedExchange = acceptedExchange;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public int getIdUserBookExchanged() {
        return idUserBookExchanged;
    }

    public void setIdUserBookExchanged(int idUserBookExchanged) {
        this.idUserBookExchanged = idUserBookExchanged;
    }
}
