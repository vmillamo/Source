package com.nttdata.webflux.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.webflux.mongo.model.mg_person;
import com.nttdata.webflux.repository.IPersonRepository;
import com.nttdata.webflux.service.IPersonService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl implements IPersonService{

	@Autowired
	private IPersonRepository iPersonRepository;
	
	@Override
	public Flux<mg_person> getAll() {
		return iPersonRepository.findAll();
	}

	@Override
	public Mono<mg_person> save(mg_person person) {
		return iPersonRepository.save(person);
	}


	
}
