package com.restaurant.bai5.service;

import com.restaurant.bai5.model.Order;
import com.restaurant.bai5.repository.OrderRepository;
import org.springframework.stereotype.Service;
public class OrderServiceBai5 {
    private OrderRepository orderRepository;

    public OrderServiceBai5(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getOrderDetail(Long id) {
        Order order = orderRepository.findById(id);
        return (order != null) ? "Món ăn: " + order.getName() : "Không tìm thấy!";
    }

    public void cancelOrder(Long id) {
        orderRepository.delete(id);
    }
}
