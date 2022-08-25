package com.nttdata.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.webflux.mongo.model.mg_account_saving;
import com.nttdata.webflux.service.IAccountSavingClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/account_saving")
public class AccountSavingController {

	@Autowired
	private IAccountSavingClientService accountSavingClientService;
	
	@GetMapping
	public Flux<mg_account_saving> getById(){
		return accountSavingClientService.getByIdClientAccount(null);
	}
	
	@PostMapping
	public Mono<mg_account_saving> save(@RequestBody mg_account_saving account_saving){
		return accountSavingClientService.save(account_saving);
	}
	
	
}
