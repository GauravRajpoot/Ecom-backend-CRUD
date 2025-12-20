package com.learning.ecommerce.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.ecommerce.gateway.api.IFakeStoreApi;

import retrofit2.Retrofit;

@Configuration
public class RetrofitConfig {

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com/")
                .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
                .build();
    }

    @Bean
    public IFakeStoreApi fakeStoreApi(Retrofit retrofit) {
        return retrofit.create(IFakeStoreApi.class);
    }   
    
}
