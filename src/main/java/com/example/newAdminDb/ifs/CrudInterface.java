package com.example.newAdminDb.ifs;

import com.example.newAdminDb.model.network.Header;

public interface CrudInterface<Req, Res> {
    //CRUD
    //추상메소드  : 반환형 (Res ) 메소드이름(Req) {  }

    Header<Res> create(Header<Req> request);
    Header<Res> read(Long id);
    Header<Res> update(Header<Req> request);
    Header delete(Long id);
}
