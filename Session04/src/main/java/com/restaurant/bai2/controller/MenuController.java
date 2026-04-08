package com.restaurant.bai2.controller;

import com.restaurant.bai1.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller("menuControllerBai2")
@RequestMapping("/bai2")
public class MenuController {
    private OrderService orderService;

    public MenuController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    @ResponseBody
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    @ResponseBody
    public String getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @GetMapping("/menu")
    @ResponseBody
    public String getMenu(
            @RequestParam(value = "category", required = false, defaultValue = "chay") String category
    ) {
        String lowerCategory = category.toLowerCase();

        if (lowerCategory.equals("chay")) {
            return "Mon chay: Dau phu, Canh chua chay";
        } else if (lowerCategory.equals("man")) {
            return "Mon man: Ga quay, Ca kho";
        } else {
            return "Thuc don " + category + " ko co";
        }
    }
}