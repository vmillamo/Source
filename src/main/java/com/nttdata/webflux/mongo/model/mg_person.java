package com.nttdata.webflux.mongo.model;

import java.time.LocalDate;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "mg_person")
public class mg_person {

    @Id
    private Integer idPerson;
    private String fullName;
    private String typeDoc;
    private String numberDoc;
    private LocalDate dateBirth;
    private String email;
    private Integer phone;
    private int status;
    private String userCreation;
    private String ipCreation;
    
}
