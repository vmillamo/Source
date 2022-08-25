package com.nttdata.webflux.service;

import com.nttdata.webflux.mongo.model.mg_account_saving;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAccountSavingService {
	
	Flux<mg_account_saving> getAll();
	Mono<mg_account_saving> save(mg_account_saving account_saving);

}
