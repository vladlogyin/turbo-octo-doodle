package com.example.northwindapi.annotations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductObject {

	@JsonProperty("unitPrice")
	private double unitPrice;

	@JsonProperty("unitsInStock")
	private int unitsInStock;

	@JsonProperty("reorderLevel")
	private int reorderLevel;

	@JsonProperty("id")
	private int id;

	@JsonProperty("quantityPerUnit")
	private String quantityPerUnit;

	@JsonProperty("discontinued")
	private boolean discontinued;

	@JsonProperty("productName")
	private String productName;

	@JsonProperty("categoryID")
	private CategoryObject categoryID;

	@JsonProperty("unitsOnOrder")
	private int unitsOnOrder;

	@JsonProperty("hibernateLazyInitializer")
	private HibernateLazyInitializer hibernateLazyInitializer;

	public void setUnitPrice(double unitPrice){
		this.unitPrice = unitPrice;
	}

	public double getUnitPrice(){
		return unitPrice;
	}

	public void setUnitsInStock(int unitsInStock){
		this.unitsInStock = unitsInStock;
	}

	public int getUnitsInStock(){
		return unitsInStock;
	}

	public void setReorderLevel(int reorderLevel){
		this.reorderLevel = reorderLevel;
	}

	public int getReorderLevel(){
		return reorderLevel;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setQuantityPerUnit(String quantityPerUnit){
		this.quantityPerUnit = quantityPerUnit;
	}

	public String getQuantityPerUnit(){
		return quantityPerUnit;
	}

	public void setDiscontinued(boolean discontinued){
		this.discontinued = discontinued;
	}

	public boolean isDiscontinued(){
		return discontinued;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return productName;
	}

	public void setCategoryID(CategoryObject categoryID){
		this.categoryID = categoryID;
	}

	public CategoryObject getCategoryID(){
		return categoryID;
	}

	public void setUnitsOnOrder(int unitsOnOrder){
		this.unitsOnOrder = unitsOnOrder;
	}

	public int getUnitsOnOrder(){
		return unitsOnOrder;
	}

	@Override
 	public String toString(){
		return 
			"ProductOject{" + 
			"unitPrice = '" + unitPrice + '\'' + 
			",unitsInStock = '" + unitsInStock + '\'' + 
			",reorderLevel = '" + reorderLevel + '\'' + 
			",id = '" + id + '\'' + 
			",quantityPerUnit = '" + quantityPerUnit + '\'' + 
			",discontinued = '" + discontinued + '\'' + 
			",productName = '" + productName + '\'' + 
			",categoryID = '" + categoryID + '\'' + 
			",unitsOnOrder = '" + unitsOnOrder + '\'' + 
			"}";
		}
}