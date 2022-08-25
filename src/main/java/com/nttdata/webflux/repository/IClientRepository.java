package com.nttdata.webflux.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.webflux.mongo.model.mg_client;


@Repository
public interface IClientRepository extends ReactiveCrudRepository<mg_client, Integer>{

}
