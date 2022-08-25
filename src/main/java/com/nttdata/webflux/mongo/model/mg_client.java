package com.nttdata.webflux.mongo.model;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "mg_client")
public class mg_client {

    @Id
    private Integer idClient;
    private Integer idTypeClient;
    private LocalDateTime dateOfEntry;
    private String userCreation;
    private String ipCreation;
    @DBRef
    private mg_person person;

}
