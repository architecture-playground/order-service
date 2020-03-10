package com.playground.order.dto;

import com.playground.order.model.OrderStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class OrderDTO {

    private UUID id;
    private OrderStatus orderStatus;
}
