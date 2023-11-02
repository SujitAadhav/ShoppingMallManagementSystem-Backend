package com.cg.shoppingmallmanagementsystem.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {

	private Integer id;
	private String name;
	private int orderid;
	private String phone;
	private String email;
	
	@OneToMany(mappedBy="customers")
	private List<OrderDetails> orderdetails;
	
	public Customer() {
		super();
	}

	public Customer(Integer id, String name, int orderid, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.orderid = orderid;
		this.phone = phone;
		this.email = email;
	}

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orderid=" + orderid + ", phone=" + phone + ", email="
				+ email + ", getId()=" + getId() + ", getName()=" + getName() + ", getOrderid()=" + getOrderid()
				+ ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
