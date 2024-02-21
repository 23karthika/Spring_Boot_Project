package com.loginpage.loginpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loginpage.loginpage.model.ProductDetails;

@Repository
public interface ProductRepository extends JpaRepository <ProductDetails,Integer>{        
} 
