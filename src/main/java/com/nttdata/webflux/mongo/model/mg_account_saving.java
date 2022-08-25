package com.nttdata.webflux.mongo.model;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "mg_account_saving")
public class mg_account_saving {

    @Id
    private Integer idSaving;
    private Integer idClient;
    private String typeSaving;
    private String typeCurrency;    
    private Integer accountNumber;
    private String typeAccount;
    private LocalDateTime registerDate;
    private Double balance;
    private Double interest;
    @DBRef
    private mg_client mgclient;
    
}
