package com.cg.shoppingmallmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.shoppingmallmanagementsystem.entity.OrderDetails;
import com.cg.shoppingmallmanagementsystem.repository.OrderDetailsRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderDetailsService {
	
	@Autowired
	private OrderDetailsRepository oRepo;
	
	public List<OrderDetails> listAll(){
		return oRepo.findAll();
	}
	
	public void save(OrderDetails orderdetails) {
		oRepo.save(orderdetails);
	}
	
	public OrderDetails get(Integer id) {
		return oRepo.findById(id).get();
	}
	
	public void delete(Integer id) {
		oRepo.deleteById(id);
	}
}
