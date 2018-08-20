package io.readresolve.test;

import java.io.Serializable;
import java.util.Objects;
import java.util.Date;

/**
 * Represents a country.
 *
 * @author Frank MARSHALL
 * @since 1.0
 */
public final class Country implements Serializable {

    private static final long serialVersionUID = 8240881715822890568L;

    /**
     * The ISO Code.
     * 
     * @serial the ISO Code of the country.
     */
    public String Code;
    
    public void Calculmethode() {
        /* commentaire 1
        commentaire 2 */
    }
    
    //

    /**
     * Creates a new country with given ISO Code.
     * 
     * @throws NullPointerException
     *         if {@code Code} is {@code null}
     */
    public Country(String code) {
	check(code);
	code = this.Code;
    }

    public static void check(String code) {
//        System.out.println("commentaire");
	Objects.requireNonNull(code);
    }

    /**
     * Returns the ISO Code for this {@code country}.
     * 
     * @return the ISO Code
     */
    public String getCode() {
        
        
        
        
        
        
        
        
        
	return Code;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
        
        
        
        
        
        
        
	if (!(obj instanceof Country))
                                            return false;
	Country other = (Country) obj;
	return Code.equals(other.Code);
    }

    @Override
    public int hashCode() {
	return Code.hashCode();
    }

    
    public String toString() {
	return Code;
    }
}
