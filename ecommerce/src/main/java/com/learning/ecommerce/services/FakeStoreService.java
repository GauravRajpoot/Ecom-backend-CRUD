package com.learning.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FakeStoreService implements IFakeStoreService {

    @Override
    public List<String> getAllCategories() {
        return List.of("electronics", "jewelery", "men's clothing", "women's clothing");
    }

}
