// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class Address {
	// Variables
	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private String state;
	private String zipCode;

	// Constructors
	Address() {

	}

	Address(String lineOneIn, String lineTwoIn, String cityIn, String stateIn, String zipCodeIn) {
		addressLineOne = lineOneIn;
		addressLineTwo = lineTwoIn;
		city = cityIn;
		state = stateIn;
		zipCode = zipCodeIn;
	}
	

	// Getters	
	public String getAddressLineOne() {
		return addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

	// Setters 
	public void setAddressLineOne(String newAddressOne) {
		addressLineOne = newAddressOne;
	}

	public void setAddressLineTwo(String newAddressTwo) {
		addressLineTwo = newAddressTwo;
	}

	public void setCity(String newCity) {
		city = newCity;
	}

	public void setState(String newState) {
		state = newState;
	}

	public void setZipCode(String newZipCode) {
		zipCode = newZipCode;
	}
}
