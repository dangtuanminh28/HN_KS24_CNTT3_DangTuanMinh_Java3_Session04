package com.restaurant.bai1.controller;

import com.restaurant.bai1.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller()
@RequestMapping("/bai1")
public class LegacyController {

    private OrderService orderService;

    public LegacyController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public String showOrderPage(
            @RequestParam(value = "action", required = false) String action,
            Model model
    ) {
        String data = orderService.getAllOrders();
        model.addAttribute("orderMessage", data);
        return "bai1";
    }

    @GetMapping
    @ResponseBody
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @PostMapping
    @ResponseBody
    public String createOrder() {
        return "Đã thêm đơn hàng mới thành công!";
    }
}