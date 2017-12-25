package com.plu.stock.dbserver.model;


import org.hibernate.annotations.Generated;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Table(name="quotes", catalog = "test")
public class Quote {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="userName")
    private String userName;

    public Quote(Integer id, String userName, String quote) {
        this.id = id;
        this.userName = userName;
        this.quote = quote;
    }

    @Column(name="quote")
    private String quote;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }


}
