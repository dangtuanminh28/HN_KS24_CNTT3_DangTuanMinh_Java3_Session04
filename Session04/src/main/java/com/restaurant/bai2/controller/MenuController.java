package com.restaurant.bai2.controller;

import com.restaurant.bai1.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public String getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @GetMapping("/menu")
    public String getMenu(
            @RequestParam(value = "category", required = false, defaultValue = "chay") String category,
            Model model
    ) {
        String content = category.equalsIgnoreCase("man") ? "Món mặn: Gà, Cá" : "Món chay: Đậu phụ, Nấm";

        model.addAttribute("menuContent", content);

        return "bai2";
    }
}