package com.nttdata.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.webflux.mongo.model.mg_person;
import com.nttdata.webflux.service.IPersonService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private IPersonService personService;
	
	@GetMapping
	public Flux<mg_person> listar(){
		return personService.getAll();
	}
	
	@PostMapping
	public Mono<mg_person> registrar(@RequestBody mg_person person){
		return personService.save(person);
	}
	
	
	
}
