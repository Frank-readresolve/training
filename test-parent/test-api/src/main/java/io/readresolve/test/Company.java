package io.readresolve.test;

import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;


public class Company {

    private String name = null;
    
    private final String jesuisinutile = "Oulala";
     private final String jesuisAUSSIinutile = "Oulala";

    public Company() {
	// TODO Auto-generated constructor stub
    }

    Company(String name) {
	if (name == null) {
	    throw new NullPointerException();
	}
	this.name = name;
    }
    
    //PraiseTheSun

    public String getName() {
	return name;
    }

    public void setName(String newName) {
	newName = this.name;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!(obj instanceof Company))
	    return false;
	Company other = (Company) obj;
	return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
    

    /**
     * Returns the name of the company.
     *
     * @return the name
     */
    @Override
    public String toString() {
	return name;
    }
}
