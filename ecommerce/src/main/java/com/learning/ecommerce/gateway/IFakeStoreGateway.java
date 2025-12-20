package com.learning.ecommerce.gateway;

import java.io.IOException;
import java.util.List;

import com.learning.ecommerce.dto.ProductDTO;

public interface IFakeStoreGateway {
    List<ProductDTO> getAllProducts() throws IOException;
}