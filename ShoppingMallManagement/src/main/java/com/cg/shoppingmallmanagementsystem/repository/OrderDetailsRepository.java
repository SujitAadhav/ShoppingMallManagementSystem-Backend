package com.cg.shoppingmallmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.shoppingmallmanagementsystem.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer>{

}
