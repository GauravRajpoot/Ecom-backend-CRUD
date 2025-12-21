package com.learning.ecommerce.controllers;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.ecommerce.dto.ProductDTO;
import com.learning.ecommerce.services.FakeStoreService;
import com.learning.ecommerce.services.IFakeStoreService;

@RestController
@RequestMapping("/api/v1/products")
public class FakeStoreController {

private final IFakeStoreService fakeStoreService;

    FakeStoreController(IFakeStoreService fakeStoreService) {
    this.fakeStoreService = fakeStoreService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllCategories() throws IOException{
        List<ProductDTO> productList= fakeStoreService.getAllCategories();
        return ResponseEntity.ok(productList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable int id) throws IOException {
        ProductDTO product = fakeStoreService.getProductById(id);
        return ResponseEntity.ok(product);
    }

    @PostMapping
    public ResponseEntity<ProductDTO > createProduct(@RequestBody ProductDTO productDTO) {
        try {
            ProductDTO createdProduct = fakeStoreService.createProduct(productDTO);
            return ResponseEntity.created(null).body(createdProduct);
        } catch (IOException e) {
            return ResponseEntity.status(500).build();
        }
    }


}


