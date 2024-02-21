package com.loginpage.loginpage.controller;

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

import com.loginpage.loginpage.model.ProductDetails;
import com.loginpage.loginpage.services.ProductService;

@RestController
public class ProductController {
    
    private ProductService productService;
    
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/productdetails")
    public ResponseEntity<ProductDetails> productDetails(@RequestBody ProductDetails productDetails){
        ProductDetails producDetails=productService.saveDetails(productDetails);
        if(producDetails!=null)
        {
            return new ResponseEntity<>(producDetails,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(producDetails,HttpStatus.NOT_FOUND);
    }

    @GetMapping("/product")
    public ResponseEntity<List<ProductDetails>> getDetails(){
        List<ProductDetails>li=productService.listofDetails();
        if(li!=null)
        {
            return new ResponseEntity<>(li,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(li,HttpStatus.NOT_FOUND);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<ProductDetails> getProductsById(@PathVariable int productId)
    {
        ProductDetails prodetails=productService.getId(productId);
        if(prodetails!=null)
        {
            return new ResponseEntity<>(prodetails,HttpStatus.CREATED);   
        }
        return new ResponseEntity<>(prodetails,HttpStatus.CREATED);
    }
    
    @PutMapping("/products/{productId}")
    public ResponseEntity<ProductDetails> updateProducts(@PathVariable int productId,@RequestBody ProductDetails productDetails)
    {
        ProductDetails putdet=productService.saveProducts(productDetails);
        if(putdet!=null)
        {
            return new ResponseEntity<>(putdet,HttpStatus.CREATED);   
        }
        return new ResponseEntity<>(putdet,HttpStatus.CREATED);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable int productId)
    {
        productService.deleteProducts(productId);
    }
}
      
