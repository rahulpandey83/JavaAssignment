package Assignment5;

import java.io.Serializable;

public class Address implements Serializable {
  
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 1L;
	private String city;
    private String state;
    private int pincode;
    private String country;
 

	public Address(String city, String state, int pincode, String country) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.country = country;
    }
 
    @Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + ", country=" + country + "]";
	}

  }