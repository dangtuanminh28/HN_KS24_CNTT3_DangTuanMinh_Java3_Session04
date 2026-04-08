package com.restaurant.bai5.repository;

import com.restaurant.bai5.model.Order;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository("orderRepositoryBai5")
public class OrderRepository {
    private List<Order> orderList = new ArrayList<>();

    public OrderRepository() {
        orderList.add(new Order(1L, "Phở Thìn"));
        orderList.add(new Order(2L, "Bún Đậu Mắm Tôm"));
    }

    public List<Order> findAll() {
        return orderList;
    }

    public Order findById(Long id) {
        return orderList.stream()
                .filter(o -> o.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void delete(Long id) {
        orderList.removeIf(o -> o.getId().equals(id));
    }
}