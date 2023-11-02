package com.cg.shoppingmallmanagementsystem.controller;

import java.util.List;

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

import com.cg.shoppingmallmanagementsystem.entity.OrderDetails;
import com.cg.shoppingmallmanagementsystem.service.OrderDetailsService;

@RestController
public class OrderDetailsController {

	@Autowired
	private OrderDetailsService oService;
	
	//RetriveAll
	@GetMapping("/orderdetails")
	public List<OrderDetails> listAll(){
		return oService.listAll();
	}
	
	//RetriveById
	@GetMapping("/orderdetails/{id}")
	public ResponseEntity<OrderDetails> get(@PathVariable Integer id){
		try {
			OrderDetails orderdetails = oService.get(id);
			return new ResponseEntity<OrderDetails>(orderdetails, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<OrderDetails>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Create
	@PostMapping("/orderdetails")
	public void add(@RequestBody OrderDetails orderdetails) {
		oService.save(orderdetails);
	}
	
	//Update
	@PutMapping("/orderdetails/{id}")
	public ResponseEntity<OrderDetails> get(@RequestBody OrderDetails orderdetails , @PathVariable Integer id){
		try {
			OrderDetails orderdetailsexist = oService.get(id);
			oService.save(orderdetails);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete
	@DeleteMapping("/orderdetails/{id}")
	public void delete(@PathVariable Integer id) {
		oService.delete(id);
	}
}
