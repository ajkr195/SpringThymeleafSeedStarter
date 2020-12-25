package com.spring.boot.rocks.conversion;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.spring.boot.rocks.entities.Variety;
import com.spring.boot.rocks.services.VarietyService;

@Component
public class VarietyFormatter implements Formatter<Variety> {

	@Autowired
	private VarietyService varietyService;

	public VarietyFormatter() {
		super();
	}

	public Variety parse(final String text, final Locale locale) throws ParseException {
		final Integer varietyId = Integer.valueOf(text);
		// There is no Formatter API yet that allows us to return a Publisher, so we
		// need to block
		return this.varietyService.findById(varietyId).block();
	}

	public String print(final Variety object, final Locale locale) {
		return (object != null ? object.getId().toString() : "");
	}

}
