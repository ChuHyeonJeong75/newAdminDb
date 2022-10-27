package com.example.newAdminDb.repository;

import com.example.newAdminDb.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findFirstByPhoneNumberOrderByIdDesc(String phoneNumber);
    Optional<User> findFirstByPhoneNumber(String phoneNumber);
}
