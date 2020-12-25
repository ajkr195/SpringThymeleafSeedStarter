package com.spring.boot.rocks.entities;

public class Row {

	private Variety variety = null;
	private Integer seedsPerCell = null;

	public Row() {
		super();
	}

	public Variety getVariety() {
		return this.variety;
	}

	public void setVariety(final Variety variety) {
		this.variety = variety;
	}

	public Integer getSeedsPerCell() {
		return this.seedsPerCell;
	}

	public void setSeedsPerCell(final Integer seedsPerCell) {
		this.seedsPerCell = seedsPerCell;
	}

	@Override
	public String toString() {
		return "Row [variety=" + this.variety + ", seedsPerCell=" + this.seedsPerCell + "]";
	}

}
