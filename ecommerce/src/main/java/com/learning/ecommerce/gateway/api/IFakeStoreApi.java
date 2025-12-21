package com.learning.ecommerce.gateway.api;

import java.util.List;

import org.springframework.stereotype.Component;

import com.learning.ecommerce.dto.ProductDTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface IFakeStoreApi {

    @GET("products")
    Call<List<ProductDTO>> getAllTheProducts();

    @GET("products/{id}")
    Call<ProductDTO> getProductById(@Path("id") int id);

    @POST("products")
    Call<ProductDTO> createProduct(@Body ProductDTO productDTO);
    
}
