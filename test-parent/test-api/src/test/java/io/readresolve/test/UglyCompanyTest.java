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
	public void shouldConstructAslo() {
		UglyCompany company = new UglyCompany();
		assertNotNull(company);
	}
	
	@Test(expected=NullPointerException.class)
	public void shouldFail() {
		UglyCompany company = new UglyCompany(null);
		assertNotNull(company);
	}

	@Test()
	public void shouldReturnName() {
		UglyCompany company = new UglyCompany("NAME");
		assertNotNull(company.toString());
	}
}
