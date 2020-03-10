package com.playground.order.service;

import com.playground.order.converter.OrderConverter;
import com.playground.order.dto.OrderDTO;
import com.playground.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderConverter orderConverter;

    public List<OrderDTO> getAll() {
        return orderRepository.findAll().stream()
                .map(orderConverter::toDto)
                .collect(Collectors.toList());
    }
}
