package classes;

public class Vehicle {
	String type;
	String license;

	public Vehicle(){}

	public Vehicle(String type, String license) {
		this.type = type;
		this.license = license;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getType() {
		return this.type;
	}

	public String getLicense() {
		return this.license;
	}
}