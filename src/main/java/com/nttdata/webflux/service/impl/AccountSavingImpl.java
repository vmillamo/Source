package com.nttdata.webflux.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.webflux.mongo.model.mg_account_saving;
import com.nttdata.webflux.repository.IAccountSavingRepository;
import com.nttdata.webflux.service.IAccountSavingService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class AccountSavingImpl implements IAccountSavingService{

	@Autowired
	private IAccountSavingRepository iIAccountSavingRepository;
	

	@Override
	public Flux<mg_account_saving> getAll() {
		return iIAccountSavingRepository.findAll();
	}

	@Override
	public Mono<mg_account_saving> save(mg_account_saving account_saving) {
		return iIAccountSavingRepository.save(account_saving);
	}


}
