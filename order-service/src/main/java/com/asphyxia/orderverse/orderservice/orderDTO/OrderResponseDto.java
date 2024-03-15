package com.asphyxia.orderverse.orderservice.orderDTO;

import com.asphyxia.orderverse.orderservice.entities.Order;
import com.asphyxia.orderverse.productservice.domain.entities.Product;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

@Builder
public record OrderResponseDto(Long id, List<Product> products) {

    public static OrderResponseDto fromOrder(Order order) {
        return OrderResponseDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

    public static List<OrderResponseDto> fromProducts(List<Product> products) {
        return products.stream().map(OrderResponseDto::fromOrder).toList();
    }
}
