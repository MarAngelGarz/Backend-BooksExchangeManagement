package com.alce.exchange_ms.models;

import java.util.Date;

public class ExchangeNotificationRequest {

    private int id;
    private Date date;
    private String title;
    private String likedmessage;
    private int idAplicant;
    private int idBook;
    private int idOwner;
    private boolean requested;


    public ExchangeNotificationRequest() {
    }

    public ExchangeNotificationRequest(int id, Date date, String title, String likedmessage, int idAplicant, int idBook , int idOwner, boolean requested) {
        this.id =id;
        this.date =date;
        this.title = title;
        this.likedmessage = likedmessage;
        this.idAplicant = idAplicant;
        this.idBook =idBook;
        this.idOwner =idOwner;
        this.requested =requested;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getLikedmessage() {
        return likedmessage;
    }

    public void setLikedmessage(String likedmessage) {
        this.likedmessage = likedmessage;
    }

    public int getIdAplicant() {
        return idAplicant;
    }

    public void setIdAplicant(int idAplicant) {
        this.idAplicant = idAplicant;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public boolean isRequested() {
        return requested;
    }

    public void setRequested(boolean requested) {
        this.requested = requested;
    }
}


