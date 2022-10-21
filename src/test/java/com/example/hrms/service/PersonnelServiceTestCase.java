package com.example.hrms.service;

import com.example.hrms.dao.AccountDao;
import com.example.hrms.domain.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonnelServiceTestCase {

    @Autowired
    PersonnelService personnelService;
    @Test
    void testGetById(){
        System.out.println(personnelService.getById(1));
    }
    @Test
    void testGetAll(){
        System.out.println(personnelService.list());
    }

}