package com.learning.ecommerce.gateway;

import java.util.List;

import com.learning.ecommerce.dto.ProductDTO;

public interface FakeStoreGateway {
    List<ProductDTO> getAllProducts();
}