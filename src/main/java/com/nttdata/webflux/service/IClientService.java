package com.nttdata.webflux.service;

import com.nttdata.webflux.mongo.model.mg_account_saving;
import com.nttdata.webflux.mongo.model.mg_client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientService {
	
	Flux<mg_client> getAll();
	Mono<mg_client> save(mg_client client);
	Mono<mg_client> getById(Integer idClient);

}
