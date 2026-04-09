package com.restaurant.bai3.controller;

import com.restaurant.bai1.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bai3")
public class OrderDetailController {

    private OrderService orderService;

    public OrderDetailController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders/{id}")
    public String getOrderDetail(@PathVariable("id") Long id, Model model) {
        String message = "Chi tiết đơn hàng số: " + id;
        model.addAttribute("orderId", id);
        return "bai3";
    }
}