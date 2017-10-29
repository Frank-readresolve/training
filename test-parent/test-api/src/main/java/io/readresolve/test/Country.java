package io.readresolve.test;

import java.io.Serializable;
import java.util.Objects;

/**
 * Represents a country.
 *
 * @author Frank MARSHALL
 * @since 1.0
 */
public final class Country implements Serializable {

    private static final long serialVersionUID = 8240881715822890568L;

    /**
     * The ISO code.
     * 
     * @serial the ISO code of the country.
     */
    private final String code;

    /**
     * Creates a new country with given ISO code.
     * 
     * @param code
     *        an ISO code
     * @throws NullPointerException
     *         if {@code code} is {@code null}
     */
    public Country(String code) {
	check(code);
	this.code = code;
    }

    private static void check(String code) {
	Objects.requireNonNull(code);
    }

    /**
     * Returns the ISO code for this {@code country}.
     * 
     * @return the ISO code
     */
    public String getCode() {
	return code;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!(obj instanceof Country))
	    return false;
	Country other = (Country) obj;
	return code.equals(other.code);
    }

    @Override
    public int hashCode() {
	return code.hashCode();
    }

    @Override
    public String toString() {
	return code;
    }
}
