package com.example.newAdminDb.service;

import com.example.newAdminDb.component.LoginUserAuditorAware;
import com.example.newAdminDb.config.JpaConfig;
import com.example.newAdminDb.ifs.CrudInterface;
import com.example.newAdminDb.model.entity.User;
import com.example.newAdminDb.model.network.Header;
import com.example.newAdminDb.model.network.request.UserApiRequest;
import com.example.newAdminDb.model.network.response.UserApiResponse;
import com.example.newAdminDb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Service
@Import({ JpaConfig.class, LoginUserAuditorAware.class})
public class UserApiLogicService implements CrudInterface<UserApiRequest, UserApiResponse> {

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

    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {
        UserApiRequest userApiRequest = request.getData();

        User user = User.builder()
                .account(userApiRequest.getAccount())
                .password(userApiRequest.getPassword())
                .status(userApiRequest.getStatus())
                .phoneNumber(userApiRequest.getPhoneNumber())
                .build();

        User newUser = userRepository.save(user);
        return response(newUser);
    }

    @Override
    public Header<UserApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }
}
