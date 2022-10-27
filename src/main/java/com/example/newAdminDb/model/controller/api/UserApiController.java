package com.example.newAdminDb.model.controller.api;

import com.example.newAdminDb.ifs.CrudInterface;
import com.example.newAdminDb.model.network.Header;
import com.example.newAdminDb.model.network.request.UserApiRequest;
import com.example.newAdminDb.model.network.response.UserApiResponse;
import com.example.newAdminDb.service.UserApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user") // localhost:8080/api/user
public class UserApiController implements CrudInterface<UserApiRequest, UserApiResponse> {
    @Autowired
    private UserApiLogicService userApiLogicService;

    @Override
    @PostMapping()
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request) {
        return userApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")  // 매개변수 Long id와 {id} 두개가 동일해야함!!
    public Header<UserApiResponse> read(Long id) {
        return null;
    }

    @Override
    @PutMapping()
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> request) {
        return null;
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(Long id) {
        return null;
    }
}
