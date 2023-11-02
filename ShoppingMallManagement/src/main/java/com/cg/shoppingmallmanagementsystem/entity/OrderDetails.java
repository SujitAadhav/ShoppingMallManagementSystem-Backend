package com.cg.shoppingmallmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetails {

	private Integer id;
	private String dateofpurchase;
	private float total;
	private int customerid;
	private String paymentmode;
	private int shopid;
	
	@ManyToOne
	private Customer customer;

	public OrderDetails() {
		super();
	}


	public OrderDetails(Integer id, String dateofpurchase, float total, int customerid, String paymentmode,
			int shopid) {
		super();
		this.id = id;
		this.dateofpurchase = dateofpurchase;
		this.total = total;
		this.customerid = customerid;
		this.paymentmode = paymentmode;
		this.shopid = shopid;
	}



	@Id
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getDateofpurchase() {
		return dateofpurchase;
	}



	public void setDateofpurchase(String dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}



	public float getTotal() {
		return total;
	}



	public void setTotal(float total) {
		this.total = total;
	}



	public int getCustomerid() {
		return customerid;
	}



	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}



	public String getPaymentmode() {
		return paymentmode;
	}



	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}



	public int getShopid() {
		return shopid;
	}



	public void setShopid(int shopid) {
		this.shopid = shopid;
	}


	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", dateofpurchase=" + dateofpurchase + ", total=" + total + ", customerid="
				+ customerid + ", paymentmode=" + paymentmode + ", shopid=" + shopid + ", getId()=" + getId()
				+ ", getDateofpurchase()=" + getDateofpurchase() + ", getTotal()=" + getTotal() + ", getCustomerid()="
				+ getCustomerid() + ", getPaymentmode()=" + getPaymentmode() + ", getShopid()=" + getShopid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
		
}
