package com.nttdata.webflux.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.webflux.mongo.model.mg_account_saving;


@Repository
public interface IAccountSavingRepository extends ReactiveCrudRepository<mg_account_saving, Integer>{

}
