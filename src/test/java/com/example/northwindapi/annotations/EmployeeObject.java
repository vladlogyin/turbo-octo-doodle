package com.example.northwindapi.annotations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeObject{

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("country")
	private String country;

	@JsonProperty("hireDate")
	private String hireDate;

	@JsonProperty("extension")
	private String extension;

	@JsonProperty("address")
	private String address;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("city")
	private String city;

	@JsonProperty("photoPath")
	private String photoPath;

	@JsonProperty("postalCode")
	private String postalCode;

	@JsonProperty("homePhone")
	private String homePhone;

	@JsonProperty("photo")
	private String photo;

	@JsonProperty("reportsTo")
	private EmployeeObject reportsTo;

	@JsonProperty("title")
	private String title;

	@JsonProperty("titleOfCourtesy")
	private String titleOfCourtesy;

	@JsonProperty("salary")
	private double salary;

	@JsonProperty("birthDate")
	private String birthDate;

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("id")
	private int id;

	@JsonProperty("region")
	private String region;

	@JsonProperty("hibernateLazyInitializer")
	private HibernateLazyInitializer hibernateLazyInitializer;

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setHireDate(String hireDate){
		this.hireDate = hireDate;
	}

	public String getHireDate(){
		return hireDate;
	}

	public void setExtension(String extension){
		this.extension = extension;
	}

	public String getExtension(){
		return extension;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setNotes(String notes){
		this.notes = notes;
	}

	public String getNotes(){
		return notes;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setPhotoPath(String photoPath){
		this.photoPath = photoPath;
	}

	public String getPhotoPath(){
		return photoPath;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setHomePhone(String homePhone){
		this.homePhone = homePhone;
	}

	public String getHomePhone(){
		return homePhone;
	}

	public void setPhoto(String photo){
		this.photo = photo;
	}

	public String getPhoto(){
		return photo;
	}

	public void setReportsTo(EmployeeObject reportsTo){
		this.reportsTo = reportsTo;
	}

	public EmployeeObject getReportsTo(){
		return reportsTo;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setTitleOfCourtesy(String titleOfCourtesy){
		this.titleOfCourtesy = titleOfCourtesy;
	}

	public String getTitleOfCourtesy(){
		return titleOfCourtesy;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public double getSalary(){
		return salary;
	}

	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}

	public String getBirthDate(){
		return birthDate;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	@Override
 	public String toString(){
		return 
			"EmployeeObject{" + 
			"lastName = '" + lastName + '\'' + 
			",country = '" + country + '\'' + 
			",hireDate = '" + hireDate + '\'' + 
			",extension = '" + extension + '\'' + 
			",address = '" + address + '\'' + 
			",notes = '" + notes + '\'' + 
			",city = '" + city + '\'' + 
			",photoPath = '" + photoPath + '\'' + 
			",postalCode = '" + postalCode + '\'' + 
			",homePhone = '" + homePhone + '\'' + 
			",photo = '" + photo + '\'' + 
			",reportsTo = '" + reportsTo + '\'' + 
			",title = '" + title + '\'' + 
			",titleOfCourtesy = '" + titleOfCourtesy + '\'' + 
			",salary = '" + salary + '\'' + 
			",birthDate = '" + birthDate + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",id = '" + id + '\'' + 
			",region = '" + region + '\'' + 
			"}";
		}
}