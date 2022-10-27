package com.example.newAdminDb.repository;

import com.example.newAdminDb.NewAdminDbApplicationTests;
import com.example.newAdminDb.model.entity.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDetailRepositoryTest extends NewAdminDbApplicationTests {
    @Autowired
    private OrderDetailRepository orderDetailRepository;
/*
    @Test
    public void create(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setStatus("test");
        orderDetail.setQuantity(100);
        orderDetail.setTotalPrice(BigDecimal.valueOf(500000));
        orderDetail.setCreatedAt(LocalDateTime.now());
        orderDetail.setCreatedBy("블랙캣");
        orderDetailRepository.save(orderDetail);
    }

 */
}
