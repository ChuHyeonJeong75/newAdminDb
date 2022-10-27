package com.example.newAdminDb.repository;

import com.example.newAdminDb.NewAdminDbApplicationTests;
import com.example.newAdminDb.model.entity.Partner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class PartnerRepositoryTest  extends NewAdminDbApplicationTests {
    @Autowired
    private PartnerRepository partnerRepository;
/*
    @Test
    public void create(){
        Partner partner = new Partner();
        partner.setName("test");
        partner.setStatus("test");
        partner.setAddress("경기도 부천");
        partner.setCreatedAt(LocalDateTime.now());
        partner.setCreatedBy("블랙캣");
        partnerRepository.save(partner);
    }
 */

}
