package com.cg.shoppingmallmanagementsystem.service;

import java.util.List;
import com.cg.shoppingmallmanagementsystem.entity.Customer;
import com.cg.shoppingmallmanagementsystem.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerRepository cRepo;
	
	public List<Customer> listAll(){
		return cRepo.findAll();
	}
	
	public void save(Customer customer) {
		cRepo.save(customer);
	}
	
	public Customer get(Integer id) {
		return cRepo.findById(id).get();
	}
	
	public void delete(Integer id) {
		cRepo.deleteById(id);
	}
}
