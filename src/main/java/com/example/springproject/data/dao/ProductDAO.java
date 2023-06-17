package com.example.springproject.data.dao;

import com.example.springproject.data.entity.ProductEntity;

public interface ProductDAO {
    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);
}
