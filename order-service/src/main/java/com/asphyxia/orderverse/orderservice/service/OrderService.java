package com.asphyxia.orderverse.orderservice.service;

import com.asphyxia.orderverse.orderservice.entities.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();

    Order getById(Long id);

    Order save(Order product);

    void delete(Long id);
}
