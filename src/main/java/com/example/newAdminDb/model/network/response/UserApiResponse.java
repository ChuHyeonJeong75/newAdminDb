package com.example.newAdminDb.model.network.response;

import lombok.*;
import java.time.LocalDateTime;
@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class UserApiResponse {

    private Long id;
    private String account;
    private String password;
    private String status;
    private String email;
    private String phoneNumber;
    private LocalDateTime registeredAt;
    private LocalDateTime unregisteredAt;
}
