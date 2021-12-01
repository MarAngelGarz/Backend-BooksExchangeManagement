package com.alce.exchange_ms.models;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Exchange {

    @Id
    private String id;
    private String idBook;
    private Integer idOwner;
    private Integer idAplicant;
    private Date date;
    private String state;
    
    public Exchange(String id, String idBook, Integer idOwner, Integer idAplicant, Date date, String state) {
        this.id = id;
        this.idBook = idBook;
        this.idOwner = idOwner;
        this.idAplicant = idAplicant;
        this.date = date;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public Integer getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Integer idOwner) {
        this.idOwner = idOwner;
    }

    public Integer getIdAplicant() {
        return idAplicant;
    }

    public void setIdAplicant(Integer idAplicant) {
        this.idAplicant = idAplicant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
