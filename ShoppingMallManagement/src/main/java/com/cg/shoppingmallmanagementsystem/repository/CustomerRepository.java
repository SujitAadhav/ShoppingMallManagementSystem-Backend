package com.cg.shoppingmallmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.shoppingmallmanagementsystem.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
