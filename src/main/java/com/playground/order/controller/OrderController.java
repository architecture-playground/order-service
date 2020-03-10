package com.playground.order.controller;

import com.playground.order.dto.OrderDTO;
import com.playground.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController("v1/order")
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/all")
    public List<OrderDTO> getAll() {
        log.info("Request all orders.");
        return orderService.getAll();
    }
}
