package io.readresolve.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountryTest {

	@Test(expected = NullPointerException.class)
	public void shouldNotConstruct() {
		new Country(null);
	}

}
