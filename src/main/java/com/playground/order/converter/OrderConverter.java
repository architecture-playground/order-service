package com.playground.order.converter;

import com.playground.order.dto.OrderDTO;
import com.playground.order.model.Order;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {

    public OrderDTO toDto(Order orderSource) {
        OrderDTO dtoTarget = new OrderDTO();
        BeanUtils.copyProperties(orderSource, dtoTarget);
        return dtoTarget;
    }
}
