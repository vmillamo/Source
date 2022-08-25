package com.nttdata.webflux.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.webflux.mongo.model.mg_client;
import com.nttdata.webflux.repository.IClientRepository;
import com.nttdata.webflux.service.IClientService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class ClientServiceImpl implements IClientService{

	@Autowired
	private IClientRepository iClientRepository;
	
	@Override
	public Flux<mg_client> getAll() {
		return iClientRepository.findAll();
	}

	@Override
	public Mono<mg_client> save(mg_client client) {
		
		if (!(Enum.Personnel.ordinal()==client.getIdTypeClient() || Enum.Bussiness.ordinal()==client.getIdTypeClient())) {
			log.info("El campo idTypeClient debe ser de tipo: 0 Personal, 1 Empresarial");
			return null;
		}else {		
			return iClientRepository.save(client);
		}
		
	}

	@Override
	public Mono<mg_client> getById(Integer idCLient) {
		return iClientRepository.findById(idCLient);
	}

}
