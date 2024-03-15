package com.asphyxia.orderverse.productservice.service;

import com.asphyxia.orderverse.productservice.domain.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(Long id);
    Product save(Product product);
    void delete(Long id);
}
