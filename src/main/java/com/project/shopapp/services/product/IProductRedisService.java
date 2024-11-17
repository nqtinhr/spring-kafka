package com.project.shopapp.services.product;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.project.shopapp.responses.product.ProductResponse;

public interface IProductRedisService {
    // Clear cached data in Redis
    void clear();// clear cache

    List<ProductResponse> getAllProducts(
            String keyword,
            Long categoryId, PageRequest pageRequest) throws JsonProcessingException;

    void saveAllProducts(List<ProductResponse> productResponses,
            String keyword,
            Long categoryId,
            PageRequest pageRequest) throws JsonProcessingException;

}
