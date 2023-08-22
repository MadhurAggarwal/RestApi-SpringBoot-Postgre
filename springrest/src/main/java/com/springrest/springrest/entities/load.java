package com.springrest.springrest.entities;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;  

@Entity
public class load {
	private String loadingPoint="defaultLoadingPoint";
	private String unloadingPoint="defaultUnloadingPoint";
	private String productType="defaultProductType";
	private String truckType="defaultTruckType";
	private int noOfTrucks=0;
	private int weight=0;
	private String comment="";
	private int shipperId=0;
	
	@Id
	private int loadId=0;
		
	private String date;
	
	public load(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks,
			int weight, String comment, int shipperId, int loadId, String date) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.loadId = loadId;
		this.date = date;
	}
	
	public load(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks,
			int weight, String comment, int shipperId, int loadId) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.loadId = loadId;
		this.setDate();
	}

	public load() {
		super();
		this.setDate();
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public int getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getShipperId() {
		return shipperId;
	}

	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}

	public int getLoadId() {
		return loadId;
	}

	public void setLoadId(int loadId) {
		this.loadId = loadId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public void setDate() {
		Date currdate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
		this.date = formatter.format(currdate);  
	}
	
}
