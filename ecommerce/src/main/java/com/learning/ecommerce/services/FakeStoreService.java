package com.learning.ecommerce.services;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.ecommerce.dto.ProductDTO;
import com.learning.ecommerce.gateway.IFakeStoreGateway;

@Service
public class FakeStoreService implements IFakeStoreService {

    private final IFakeStoreGateway fakeStoreGateway;

    FakeStoreService(IFakeStoreGateway fakeStoreGateway) {
        this.fakeStoreGateway = fakeStoreGateway;
    }

    @Override
    public List<ProductDTO> getAllCategories() throws IOException {
        return fakeStoreGateway.getAllProducts();
    }

    @Override
    public ProductDTO getProductById(int id) throws IOException {
        return fakeStoreGateway.getProductById(id);
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) throws IOException {
        return fakeStoreGateway.createProduct(productDTO);
    }
}