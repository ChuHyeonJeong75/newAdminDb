package com.example.newAdminDb.model.controller;

import com.example.newAdminDb.model.network.Header;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api") //localhost:8080/api
public class GetController {
    @GetMapping("/header")   //localhost:8080/api/header
    public Header getHeader(){
        return Header.builder()
                .resultCode("ok")
                .description("test")
                .build();
    }
    @GetMapping("/header2")   //localhost:8080/api/header2
    public Header getHeader2(){
        Header header = Header.builder()
                .description("test")
                .resultCode("OK")
                .transactionTime(LocalDateTime.now())
                .build();
        return header;
    }


}
