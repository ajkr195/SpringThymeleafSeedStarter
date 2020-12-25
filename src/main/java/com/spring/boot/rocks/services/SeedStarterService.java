package com.spring.boot.rocks.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.rocks.entities.SeedStarter;
import com.spring.boot.rocks.repositories.SeedStarterRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SeedStarterService {

	@Autowired
	private SeedStarterRepository seedstarterRepository;

	public SeedStarterService() {
		super();
	}

	public Flux<SeedStarter> findAll() {
		return this.seedstarterRepository.findAll();
	}

	public Mono<Void> add(final SeedStarter seedStarter) {
		return this.seedstarterRepository.add(seedStarter);
	}

}
