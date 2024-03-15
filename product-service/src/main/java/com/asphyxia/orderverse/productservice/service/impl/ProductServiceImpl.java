package com.asphyxia.orderverse.productservice.service.impl;

import com.asphyxia.orderverse.productservice.domain.entities.Product;
import com.asphyxia.orderverse.productservice.repository.ProductRepository;
import com.asphyxia.orderverse.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.findById(id).ifPresent(productRepository::delete);
    }
}
