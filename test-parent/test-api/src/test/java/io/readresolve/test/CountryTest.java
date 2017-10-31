package io.readresolve.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountryTest {

	@Test(expected = NullPointerException.class)
	public void shouldNotConstruct() {
		new Country(null);
	}
	
	
	@Test()
	public void shouldConstruct() {
		Country country = new Country("");
		assertNotNull(country);
	}
        
        @Test()
        public void testCalculmethode() {
                Country country = new Country("");
                country.Calculmethode();
                assertNotNull(country);
        }
        
        @Test()
        public void testGetCode() {
                Country country = new Country("");
                country.getCode();
                assertNotNull(country);
        }
        
        @Test()
        public void testEquals() {
                Country country = new Country("");
                Object obj = new Object();
                assertNotNull(country.equals(obj));
        }
        
        @Test(expected = NullPointerException.class)
        public void testHashCode() {
                Country country = new Country("");
                country.hashCode();
                assertNotNull(country);
        }
        
        @Test(expected = AssertionError.class)
        public void testToString() {
                Country country = new Country("");
                country.toString();
                assertNull(country);
        }
}
