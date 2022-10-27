package com.example.newAdminDb.repository;

import com.example.newAdminDb.NewAdminDbApplicationTests;
import com.example.newAdminDb.component.LoginUserAuditorAware;
import com.example.newAdminDb.config.JpaConfig;
import com.example.newAdminDb.model.entity.User;
import com.example.newAdminDb.model.network.Header;
import com.example.newAdminDb.model.network.response.UserApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

@Import({JpaConfig.class, LoginUserAuditorAware.class})
public class UserRepositoryTest extends NewAdminDbApplicationTests {
    @Autowired
    private UserRepository userRepository;

    private Header<UserApiResponse> response(User user){
        UserApiResponse userApiResponse = UserApiResponse.builder()
                .id(user.getId())
                .account(user.getAccount())
                .password(user.getPassword())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .status(user.getStatus())
                .registeredAt(user.getRegisteredAt())
                .unregisteredAt(user.getUnregisteredAt())
                .build();

        return Header.OK(userApiResponse);
    }

}