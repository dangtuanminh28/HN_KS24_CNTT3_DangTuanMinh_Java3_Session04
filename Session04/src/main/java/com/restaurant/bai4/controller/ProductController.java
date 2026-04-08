package com.restaurant.bai4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bai4")
public class ProductController {

    @GetMapping("/products")
    public String searchProducts(
            @RequestParam("category") String category,
            @RequestParam("limit") Integer limit,
            ModelMap model
    ) {
        model.addAttribute("cat", category)
                .addAttribute("lim", limit)
                .addAttribute("msg", "Tìm kiếm thành công!");

        return "productList";
    }
}