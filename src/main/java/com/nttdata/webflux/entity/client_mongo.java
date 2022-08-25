package com.nttdata.webflux.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "client_mongo")
public class client_mongo {

  @Id
  private String id;
  private String title;
  private String isbn;
  
}
	
