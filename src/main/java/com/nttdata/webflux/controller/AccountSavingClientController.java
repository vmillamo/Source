package com.nttdata.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.webflux.mongo.model.mg_account_saving;
import com.nttdata.webflux.mongo.model.mg_client;
import com.nttdata.webflux.service.IAccountSavingClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/account_saving_client")
public class AccountSavingClientController {

	@Autowired
	private IAccountSavingClientService accountSavingClientService;
	
	@GetMapping("/accountClient/{id}")
	public Flux<mg_account_saving> getAccountByClient(@PathVariable("id") Integer id){
		return accountSavingClientService.getByIdClientAccount(id);
	}
	
	@GetMapping("/client/{id}")
	public Flux<mg_client> getByClient(@PathVariable("id") Integer id){
		return accountSavingClientService.getByIdClient(id);
	}

	
	@PostMapping
	public Mono<mg_account_saving> registrar(@RequestBody mg_account_saving account_saving){
		return accountSavingClientService.save(account_saving);
	}
	
	
}
