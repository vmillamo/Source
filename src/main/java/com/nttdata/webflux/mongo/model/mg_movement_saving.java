package com.nttdata.webflux.mongo.model;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "mg_movement_saving")
public class mg_movement_saving {

    @Id
    private Integer idMovementFixed;
    private mg_client idFixed;
    private LocalDateTime dateMovement;    
    private String type;    
    private Double interest;    
    private Double balance;

}
