package com.loginpage.loginpage.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.loginpage.loginpage.model.ProductDetails;
import com.loginpage.loginpage.repository.ProductRepository;

@Service
public class ProductService {
    private ProductRepository productRepository;
    
    
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductDetails saveDetails(ProductDetails productDetails)
    {
        return productRepository.save(productDetails);
    }
     
    public List<ProductDetails> listofDetails()
    {
        return productRepository.findAll();
    }
     
    public ProductDetails getId(int productId)
    {
        return productRepository.findById(productId).orElse(null);
    }

    public ProductDetails saveProducts(ProductDetails productDetails)
    {
        return productRepository.save(productDetails);
    }

    public void deleteProducts(int productId)
    {
        productRepository.deleteById(productId);
    }
}
