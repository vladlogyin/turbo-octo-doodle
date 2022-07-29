package com.example.northwindapi.annotations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryObject {

	@JsonProperty("description")
	private String description;

	@JsonProperty("id")
	private int id;

	@JsonProperty("categoryName")
	private String categoryName;

	@JsonProperty("picture")
	private String picture;

	@JsonProperty("hibernateLazyInitializer")
	private HibernateLazyInitializer hibernateLazyInitializer;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}

	public String getCategoryName(){
		return categoryName;
	}

	public void setPicture(String picture){
		this.picture = picture;
	}

	public String getPicture(){
		return picture;
	}

	public void setHibernateLazyInitializer(HibernateLazyInitializer hibernateLazyInitializer){
		this.hibernateLazyInitializer = hibernateLazyInitializer;
	}

	public HibernateLazyInitializer getHibernateLazyInitializer(){
		return hibernateLazyInitializer;
	}

	@Override
 	public String toString(){
		return 
			"CategoryID{" + 
			"description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",categoryName = '" + categoryName + '\'' + 
			",picture = '" + picture + '\'' + 
			",hibernateLazyInitializer = '" + hibernateLazyInitializer + '\'' + 
			"}";
		}
}