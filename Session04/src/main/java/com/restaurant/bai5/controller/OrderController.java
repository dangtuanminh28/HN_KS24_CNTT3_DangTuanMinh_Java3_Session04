package com.restaurant.bai5.controller;

import com.restaurant.bai5.service.OrderServiceBai5;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

public class OrderController {
    @RestController
    @RequestMapping("/bai5/orders")
    public class OrderControllerBai5 {

        private OrderServiceBai5 orderServiceBai5;

        public OrderControllerBai5(OrderServiceBai5 orderServiceBai5) {
            this.orderServiceBai5 = orderServiceBai5;
        }

        @GetMapping("/{id}")
        public String viewOrder(@PathVariable String id) {
            try {
                Long orderId = Long.parseLong(id);
                return "Ket qua: " + orderServiceBai5.getOrderDetail(orderId);
            } catch (NumberFormatException e) {
                return "So ko hop le";
            }
        }

        @DeleteMapping("/{id}")
        public String cancelOrder(@PathVariable Long id) {
            orderServiceBai5.cancelOrder(id);
            return "Da huy don: " + id;
        }
    }
}