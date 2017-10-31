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

    @Test(expected = NullPointerException.class)
    public void shouldFail() {
        Company company = new Company(null);
        assertNotNull(company);
    }

    @Test()
    public void shouldReturnName() {
        Company company = new Company("NAME");
        assertNotNull(company.toString());
    }

    @Test()
    public void shouldSetName() {
        Company company = new Company("SANS NOM");
        company.setName("Ivalice");
        assertEquals("Ivalice", company.getName());
    }

    @Test()
    public void shouldEquals() {
        Company company = new Company("YES");
        Company company2 = new Company("YES");
        assertEquals(company2, company);
    }

    @Test()
    public void shouldHashCode() {
        Company company = new Company("YES");
        Company company2 = new Company("YES");
        assertEquals(company.hashCode(), company2.hashCode());
    }

}
