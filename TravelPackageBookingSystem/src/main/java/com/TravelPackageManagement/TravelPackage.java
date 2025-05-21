package com.TravelPackageManagement;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//============================
//MODULE 2: Travel Package Management
//============================

//Entity: TravelPackage
@Entity
public class TravelPackage {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long packageId;

 private String title;
 private String description;
 private int duration;
 private double price;
 private String includedServices;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getIncludedServices() {
	return includedServices;
}
public void setIncludedServices(String includedServices) {
	this.includedServices = includedServices;
}

 // Getters and Setters
}


