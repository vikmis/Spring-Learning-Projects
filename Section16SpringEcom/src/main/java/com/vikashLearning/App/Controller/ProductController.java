package com.vikashLearning.App.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vikashLearning.App.Serivce.ProductService;
import com.vikashLearning.App.model.Product;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProdducts() {
		
		return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK) ;
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id){
		
		Product product = productService.getProductById(id);
		
		if(product.getId()>0) {
			return new ResponseEntity<>(product,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(product,HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	@GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getProductImage(@PathVariable int productId) {
        Product product = productService.getProductById(productId);
        if (product.getId() > 0) {
            return new ResponseEntity<>(product.getImageData(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	@PostMapping("/product")
	public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile){
		Product saveProduct =null;
		try {
			saveProduct=productService.addOrUpdateProduct(product,imageFile);
			return new ResponseEntity<>(saveProduct,HttpStatus.CREATED);
		} catch (IOException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	  @PutMapping("/product/{id}")
	    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestPart Product product, @RequestPart MultipartFile imageFile) {
	        Product updatedProduct = null;
	        try {
	            updatedProduct = productService.addOrUpdateProduct(product, imageFile);
	            return new ResponseEntity<>("Updated", HttpStatus.OK);
	        } catch (IOException e) {
	            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	  
	  @DeleteMapping("/product/{id}")
	    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
	        Product product = productService.getProductById(id);
	        if (product != null) {
	            productService.deleteProduct(id);
	            return new ResponseEntity<>("Deleted", HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/product/search")
	    public ResponseEntity<List<Product>> searchProducts(@RequestParam String keyword) {
	        List<Product> products = productService.searchProducts(keyword);
	        System.out.println("searching with :" + keyword);
	        return new ResponseEntity<>(products, HttpStatus.OK);
	    }
}
