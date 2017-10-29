package io.readresolve.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompanyTest {
	@Test()
	public void shouldConstruct() {
		Company company = new Company("");
		assertNotNull(company);
	}
	
	@Test()
	public void shouldConstructAslo() {
		Company company = new Company();
		assertNotNull(company);
	}
	
	@Test(expected=NullPointerException.class)
	public void shouldFail() {
		Company company = new Company(null);
		assertNotNull(company);
	}

	@Test()
	public void shouldReturnName() {
		Company company = new Company("NAME");
		assertNotNull(company.toString());
	}
}
