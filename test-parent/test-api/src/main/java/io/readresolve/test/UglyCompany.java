package io.readresolve.test;

public class UglyCompany {

	public String name = null;

	private Country country;

	public UglyCompany() {
		// TODO Auto-generated constructor stub
	}

	UglyCompany(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println(name);
		return name;
	}

	/**
	 * Returns the name of the ugly company.
	 * 
	 * @return the name
	 */
	@Override
	public String toString() {
		return name;
	}

	public static int sum(int x, int y) {
		return x + y;
	}
}
