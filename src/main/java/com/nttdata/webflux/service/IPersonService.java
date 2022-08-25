package com.nttdata.webflux.service;

import com.nttdata.webflux.mongo.model.mg_person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonService {
	
	Flux<mg_person> getAll();
	Mono<mg_person> save(mg_person person);

}
