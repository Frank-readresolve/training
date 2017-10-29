package io.readresolve.test;

public class Company {

    public String name = null;

    private Country country;

    public Company() {
	// TODO Auto-generated constructor stub
    }

    Company(String name) {
	if (name == null) {
	    throw new NullPointerException();
	}
	this.name = name;
    }

    public String getName() {
	// System.out.println(name);
	return name;
    }

    public void setName(String name) {
	name = this.name;
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
