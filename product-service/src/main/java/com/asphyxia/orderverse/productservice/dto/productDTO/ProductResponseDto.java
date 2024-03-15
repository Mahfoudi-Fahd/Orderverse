package com.asphyxia.orderverse.productservice.dto.productDTO;

import com.asphyxia.orderverse.productservice.domain.entities.Product;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

@Builder
public record ProductResponseDto(Long id, String name, String description, BigDecimal price) {

    public static ProductResponseDto fromProduct(Product product) {
        return ProductResponseDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

    public static List<ProductResponseDto> fromProducts(List<Product> products) {
        return products.stream().map(ProductResponseDto::fromProduct).toList();
    }
}
