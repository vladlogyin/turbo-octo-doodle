package com.example.northwindapi.annotations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerObject{

	@JsonProperty("country")
	private String country;

	@JsonProperty("contactTitle")
	private String contactTitle;

	@JsonProperty("address")
	private String address;

	@JsonProperty("city")
	private String city;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("contactName")
	private String contactName;

	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("postalCode")
	private String postalCode;

	@JsonProperty("id")
	private String id;

	@JsonProperty("region")
	private Object region;

	@JsonProperty("fax")
	private String fax;

	@JsonProperty("hibernateLazyInitializer")
	private HibernateLazyInitializer hibernateLazyInitializer;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setContactTitle(String contactTitle){
		this.contactTitle = contactTitle;
	}

	public String getContactTitle(){
		return contactTitle;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setContactName(String contactName){
		this.contactName = contactName;
	}

	public String getContactName(){
		return contactName;
	}

	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	public String getCompanyName(){
		return companyName;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setRegion(Object region){
		this.region = region;
	}

	public Object getRegion(){
		return region;
	}

	public void setFax(String fax){
		this.fax = fax;
	}

	public String getFax(){
		return fax;
	}

	@Override
 	public String toString(){
		return 
			"CustomerObject{" + 
			"country = '" + country + '\'' + 
			",contactTitle = '" + contactTitle + '\'' + 
			",address = '" + address + '\'' + 
			",city = '" + city + '\'' + 
			",phone = '" + phone + '\'' + 
			",contactName = '" + contactName + '\'' + 
			",companyName = '" + companyName + '\'' + 
			",postalCode = '" + postalCode + '\'' + 
			",id = '" + id + '\'' + 
			",region = '" + region + '\'' + 
			",fax = '" + fax + '\'' + 
			"}";
		}
}