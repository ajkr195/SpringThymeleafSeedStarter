package com.spring.boot.rocks.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.boot.rocks.entities.SeedStarter;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class SeedStarterRepository {

	private final List<SeedStarter> seedStarters = new ArrayList<SeedStarter>();

	public SeedStarterRepository() {
		super();
	}

	/*
	 * There is no real need to make these return Publishers instead of values
	 * directly, but we will do it anyway to emulate an environment in which data is
	 * obtained from a reactive data source.
	 */

	public Flux<SeedStarter> findAll() {
		return Flux.fromIterable(this.seedStarters);
	}

	public Mono<Void> add(final SeedStarter seedStarter) {
		return Mono.fromRunnable(() -> this.seedStarters.add(seedStarter));
	}

}
