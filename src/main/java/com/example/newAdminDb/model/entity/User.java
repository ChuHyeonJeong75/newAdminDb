package com.example.newAdminDb.model.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data@AllArgsConstructor@NoArgsConstructor@Entity@Builder
@ToString(exclude = {"orderGroupList"})
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String account;
    private String password;
    private String status;
    private String email;
    private String phoneNumber;
    private LocalDateTime registeredAt;
    private LocalDateTime unregisteredAt;

    @CreatedDate
    private LocalDateTime createdAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @LastModifiedBy
    private String updatedBy;

    //user : OrderGroup
    // 1 : N
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user") //나(user) 에대해 연관관계를 알려줌
    private List<OrderGroup> orderGroupList;    //데이타가 여러개 일 수 있어 List로 사용

}
