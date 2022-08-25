package com.nttdata.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.webflux.mongo.model.mg_client;
import com.nttdata.webflux.service.IClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private IClientService clientService;
	
	@GetMapping
	public Flux<mg_client> listar(){
		return clientService.getAll();
	}
	
	@PostMapping
	public Mono<mg_client> registrar(@RequestBody mg_client client){
		return clientService.save(client);
	}
	
	
}
