package com.learning.ecommerce.services;

import java.io.IOException;
import java.util.List;

import com.learning.ecommerce.dto.ProductDTO;

public interface IFakeStoreService {

    List<ProductDTO> getAllCategories() throws IOException;
    
}
