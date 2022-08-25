package com.nttdata.webflux.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.webflux.mongo.model.mg_person;


@Repository
public interface IPersonRepository extends ReactiveCrudRepository<mg_person, Integer>{

}
