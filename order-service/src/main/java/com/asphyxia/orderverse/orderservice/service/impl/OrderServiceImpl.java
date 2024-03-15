package com.asphyxia.orderverse.orderservice.service.impl;

import com.asphyxia.orderverse.orderservice.entities.Order;
import com.asphyxia.orderverse.orderservice.repository.OrderRepository;
import com.asphyxia.orderverse.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order getById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order save(Order product) {
        return orderRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        orderRepository.findById(id).ifPresent(orderRepository::delete);
    }
}
