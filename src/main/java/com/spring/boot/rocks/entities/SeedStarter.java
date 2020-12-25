package com.spring.boot.rocks.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SeedStarter {

	private Integer id = null;
	private Date datePlanted = null;
	private Boolean covered = null;
	private Type type = Type.PLASTIC;
	private Feature[] features = null;

	private List<Row> rows = new ArrayList<Row>();

	public SeedStarter() {
		super();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public Date getDatePlanted() {
		return this.datePlanted;
	}

	public void setDatePlanted(final Date datePlanted) {
		this.datePlanted = datePlanted;
	}

	public Boolean getCovered() {
		return this.covered;
	}

	public void setCovered(final Boolean covered) {
		this.covered = covered;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(final Type type) {
		this.type = type;
	}

	public Feature[] getFeatures() {
		return this.features;
	}

	public void setFeatures(final Feature[] features) {
		this.features = features;
	}

	public List<Row> getRows() {
		return this.rows;
	}

	@Override
	public String toString() {
		return "SeedStarter [id=" + this.id + ", datePlanted=" + this.datePlanted + ", covered=" + this.covered
				+ ", type=" + this.type + ", features=" + Arrays.toString(this.features) + ", rows=" + this.rows + "]";
	}

}
