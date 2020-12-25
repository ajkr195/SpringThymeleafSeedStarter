package com.spring.boot.rocks.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.rocks.entities.Variety;
import com.spring.boot.rocks.repositories.VarietyRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VarietyService {

	@Autowired
	private VarietyRepository varietyRepository;

	public VarietyService() {
		super();
	}

	public Flux<Variety> findAll() {
		return this.varietyRepository.findAll();
	}

	public Mono<Variety> findById(final Integer id) {
		return this.varietyRepository.findById(id);
	}

}
