package com.example.newAdminDb.repository;


import com.example.newAdminDb.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
    Item findFirstByNameOrderById(String name);
}
