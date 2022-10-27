package com.example.newAdminDb.repository;

import com.example.newAdminDb.NewAdminDbApplicationTests;
import com.example.newAdminDb.model.entity.Item;
import com.example.newAdminDb.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

public class ItemRepositoryTest extends NewAdminDbApplicationTests {
    @Autowired
    private ItemRepository itemRepository;
 /*
    @Test
    public void create(){
        Item item = new Item();
        item.setStatus("test");
        item.setName("엘지TV");
        item.setTitle("테스트");
        item.setPrice(BigDecimal.valueOf(100000));
        item.setCreatedAt(LocalDateTime.now());
        item.setCreatedBy("블랙캣");
        itemRepository.save(item);
    }
*/
    @Test
    @Transactional
    public void read(){
        //Item item = itemRepository.findFirstByNameOrderById("컴퓨터-전자제품5호");
        Optional<Item> item = itemRepository.findById(1000L);
        item.ifPresentOrElse(selectItem ->{
                System.out.println(" 아이템명 : " + selectItem.getName());
        }, ()-> System.out.println("No Data")
        );
        /*
        if(item != null){
            item.getOrderDetailList().stream().forEach(list -> {
                System.out.println(" 아이템 : " + list.getItem().getName());
                System.out.println(" 이름 : "+ list.getOrderGroup().getRevName());
                System.out.println(" 배송지 : "+ list.getOrderGroup().getRevAddress());
                System.out.println(" 날짜 : "+ list.getCreatedAt());

            });
            System.out.println(" 콜센터"+item.getPartner().getCallCenter());
        }

         */
    }

}
