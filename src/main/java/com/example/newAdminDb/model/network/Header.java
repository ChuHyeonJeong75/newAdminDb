package com.example.newAdminDb.model.network;

import lombok.*;

import java.time.LocalDateTime;

@Builder@Data@AllArgsConstructor@NoArgsConstructor
public class Header<T>  {

    private LocalDateTime transactionTime;      //통신시간
    private String resultCode;                  //응답코드
    private String description;                 //부가설명
    private T data;                             //바디

    //메세지 3개 생성
    public static <T> Header<T> OK(){           //ok
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("ok")
                .description("ok")
                .build();
    }
    public static <T> Header<T> OK(T data){    //data ok
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("ok")
                .description("ok")
                .data(data)
                .build();
    }
    public static <T> Header<T> Error(String description){    //error
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("Error")
                .description(description)
                .build();
    }
}
