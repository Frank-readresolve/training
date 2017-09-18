package io.readresolve.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class UglyCompanyTest {
	@Test()
	public void shouldConstruct() {
		UglyCompany company = new UglyCompany("");
		assertNotNull(company);
	}

	@Test()
	public void shouldReturnName() {
		UglyCompany company = new UglyCompany("NAME");
		assertNotNull(company.toString());
	}
}
