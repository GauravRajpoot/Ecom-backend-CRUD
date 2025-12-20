package com.learning.ecommerce.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public List<ProductDTO> getAllCategories() throws IOException{
        return fakeStoreService.getAllCategories();
    }



}
