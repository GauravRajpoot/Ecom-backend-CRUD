package com.learning.ecommerce.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.ecommerce.services.FakeStoreService;
import com.learning.ecommerce.services.IFakeStoreService;

@RestController
@RequestMapping("/api/v1/categories")
public class FakeStoreController {

private final IFakeStoreService fakeStoreService;

    FakeStoreController(IFakeStoreService fakeStoreService) {
    this.fakeStoreService = fakeStoreService;
    }

    @GetMapping
    public Object getAllCategories() {
        return fakeStoreService.getAllCategories();
    }



}
