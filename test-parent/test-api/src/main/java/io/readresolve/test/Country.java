package io.readresolve.test;

import java.io.Serializable;
import java.util.Objects;

public final class Country implements Serializable {

	private static final long serialVersionUID = 8240881715822890568L;
	
	private final String code;

	public Country(String code) {
		Objects.requireNonNull(code);
		this.code = code;
	}

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
