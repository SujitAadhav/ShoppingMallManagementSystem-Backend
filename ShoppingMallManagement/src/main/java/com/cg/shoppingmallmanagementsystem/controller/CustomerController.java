package com.cg.shoppingmallmanagementsystem.controller;

import java.util.List;
import com.cg.shoppingmallmanagementsystem.entity.Customer;
import com.cg.shoppingmallmanagementsystem.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService cService;
	
	@GetMapping("/customers")
	public List<Customer> listAll(){
		return cService.listAll();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> get(@PathVariable Integer id){
		try {
			Customer customer = cService.get(id);
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/customers")
	public void add(@RequestBody Customer customer) {
		cService.save(customer);
	}
	
	@PutMapping("/customers/{id}")
	public ResponseEntity<Customer> get(@RequestBody Customer customer, @PathVariable Integer id){
		try {
			Customer existcustomer = cService.get(id);
			cService.save(customer);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/customers/{id}")
	public void delete(@PathVariable Integer id) {
		cService.delete(id);
	}
}
