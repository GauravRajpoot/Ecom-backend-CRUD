package com.learning.ecommerce.gateway;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learning.ecommerce.dto.ProductDTO;
import com.learning.ecommerce.gateway.api.IFakeStoreApi;


@Component
public class FakeStoreGatewayImpl implements IFakeStoreGateway {

    private final IFakeStoreApi fakeStoreApi;

    FakeStoreGatewayImpl(IFakeStoreApi fakeStoreApi) {
        this.fakeStoreApi = fakeStoreApi;
    }

    @Override
    public List<ProductDTO> getAllProducts() throws IOException {
         return this.fakeStoreApi.geetAllTheProducts().execute().body();
     }

}