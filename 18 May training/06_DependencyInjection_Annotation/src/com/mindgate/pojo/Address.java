package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address")
@Scope("prototype")

public class Address
{
	private int addressId;
	private String street;
	private String city;
	private String state;
	
	public Address() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor Address called");
	}

	public Address(int addressId, String street, String city, String state) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		System.out.println("Parametrized constructor of Address called");
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		System.out.println("setting "+addressId);
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		System.out.println("setting "+street);
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("setting "+city);
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("setting "+state);
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
	

}
