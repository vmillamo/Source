package com.nttdata.webflux.service.impl;



import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.webflux.mongo.model.mg_account_saving;
import com.nttdata.webflux.mongo.model.mg_client;
import com.nttdata.webflux.repository.IAccountSavingRepository;
import com.nttdata.webflux.repository.IClientRepository;
import com.nttdata.webflux.service.IAccountSavingClientService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class AccountSavingClientImpl implements IAccountSavingClientService{

	private final CopyOnWriteArrayList<mg_client> mgclient = new CopyOnWriteArrayList<>();
	
	private final CopyOnWriteArrayList<mg_account_saving> mgaccountsaving = new CopyOnWriteArrayList<>();	
	
	@Autowired
	private IClientRepository iClientRepository;

	@Autowired
	private IAccountSavingRepository iIAccountSavingRepository;

	@Override
	public Flux<mg_client> getByIdClient(Integer idClient) {
//	    return Flux.fromIterable(mgclient)
//		        .filter(xmg_client -> xmg_client.getIdClient().equals(idClient))
//		        .next();
		return iClientRepository.findAll()
				.filter(xmg_client-> xmg_client.getIdClient().equals(idClient));		
	}
	
	@Override
	public Flux<mg_account_saving> getByIdClientAccount(Integer idClient) {
		return iIAccountSavingRepository.findAll()
				.filter(xmg_account_saving-> xmg_account_saving.getIdClient().equals(idClient));
	}
	

	@Override
	public Mono<mg_account_saving> save(mg_account_saving account_saving) {
		
		Flux<mg_client> objCLientData = this.getByIdClient(account_saving.getIdClient());
		
		Flux<mg_account_saving> objCLientAccountData = this.getByIdClientAccount(account_saving.getIdClient());
	
		if (!(objCLientData.equals(null))) {

			// Completar la validacion
//			objCLientData.map
//			
//			Iterator it = objCLientData.map.keySet().iterator();
//			while(it.hasNext()){
//			  Integer key = it.next();
//			  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
//			}
			
			//log.info("El cliente es de tipo Personal, solo puede tener una cuenta");
			
			return iIAccountSavingRepository.save(account_saving);
		}else {
			log.info("El cliente no existe, debe crearlo");
			return null;
		}
		
		//return null;
	}









	
}
