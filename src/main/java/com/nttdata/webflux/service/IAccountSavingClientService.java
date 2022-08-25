package com.nttdata.webflux.service;

import com.nttdata.webflux.mongo.model.mg_account_saving;
import com.nttdata.webflux.mongo.model.mg_client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAccountSavingClientService {
	
	Flux<mg_client> getByIdClient(Integer idClient);
	Mono<mg_account_saving> save(mg_account_saving account_saving);
	Flux<mg_account_saving> getByIdClientAccount(Integer idClient);

}
