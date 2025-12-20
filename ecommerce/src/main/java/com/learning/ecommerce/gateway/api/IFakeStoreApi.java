package com.learning.ecommerce.gateway.api;

import java.util.List;

import org.springframework.stereotype.Component;

import com.learning.ecommerce.dto.ProductDTO;

import retrofit2.Call;
import retrofit2.http.GET;


public interface IFakeStoreApi {

    @GET("products")
    Call<List<ProductDTO>> geetAllTheProducts();
    
}
