package com.example.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "Products")
@EnableTransactionManagement
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PID")
	private int id;
	
	@Column(name = "pName")
	private String productname;
	
	@Column(name = "pSeason")
	private String season;
	
	@Column(name = "pBrand")
	private String brand;
	
	@Column(name = "pCategory")
	private String category;
	
	@Column(name = "pPrice")
	private float price;
	
	@Column(name = "pColor")
	private String color;
	
	@Column(name = "pCreatedDate")
	private String cdate;
	
	@Column(name = "pDiscount")
	private int discount;

	@Column(name = "pQuantity")
	private int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getDate() {
		return cdate;
	}

	public void setDate(String cdate) {
		this.cdate = cdate;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}



