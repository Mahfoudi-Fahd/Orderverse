package com.asphyxia.orderverse.orderservice.orderDTO;

import com.asphyxia.orderverse.productservice.domain.entities.Product;

import java.math.BigDecimal;

public record OrderCreationRequestDto(String name, String description, BigDecimal price) {

    public Product toProduct() {
        return Product.builder()
                .name(name())
                .description(description())
                .price(price())
                .build();
    }
}