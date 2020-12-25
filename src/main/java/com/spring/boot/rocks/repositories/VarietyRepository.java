package com.spring.boot.rocks.repositories;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.boot.rocks.entities.Variety;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class VarietyRepository {

	private final Map<Integer, Variety> varietiesById;

	public VarietyRepository() {

		super();

		this.varietiesById = new LinkedHashMap<Integer, Variety>();

		final Variety var1 = new Variety();
		var1.setId(Integer.valueOf(1));
		var1.setName("Thymus vulgaris");
		this.varietiesById.put(var1.getId(), var1);

		final Variety var2 = new Variety();
		var2.setId(Integer.valueOf(2));
		var2.setName("Thymus x citriodorus");
		this.varietiesById.put(var2.getId(), var2);

		final Variety var3 = new Variety();
		var3.setId(Integer.valueOf(3));
		var3.setName("Thymus herba-barona");
		this.varietiesById.put(var3.getId(), var3);

		final Variety var4 = new Variety();
		var4.setId(Integer.valueOf(4));
		var4.setName("Thymus pseudolaginosus");
		this.varietiesById.put(var4.getId(), var4);

		final Variety var5 = new Variety();
		var5.setId(Integer.valueOf(5));
		var5.setName("Thymus serpyllum");
		this.varietiesById.put(var5.getId(), var5);

	}

	/*
	 * There is no real need to make these return Publishers instead of values
	 * directly, but we will do it anyway to emulate an environment in which data is
	 * obtained from a reactive data source.
	 */

	public Flux<Variety> findAll() {
		return Flux.fromIterable(this.varietiesById.values());
	}

	public Mono<Variety> findById(final Integer id) {
		return Mono.fromCallable(() -> this.varietiesById.get(id));
	}

}
