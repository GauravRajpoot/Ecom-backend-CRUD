package com.learning.ecommerce.gateway;

import java.io.IOException;
import java.util.List;

import com.learning.ecommerce.dto.ProductDTO;

public class FakeStoreGatewayImpl_okta implements IFakeStoreGateway {

    @Override
    public List<ProductDTO> getAllProducts() throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

    @Override
    public ProductDTO getProductById(int id) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductById'");
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProduct'");
    }
    
}
