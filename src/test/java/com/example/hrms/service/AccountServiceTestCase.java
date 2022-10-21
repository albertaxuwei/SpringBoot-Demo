package com.example.hrms.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountServiceTestCase {
    @Autowired
    AccountService accountService;
    @Test
    void testGetById(){
        System.out.println(accountService.getById(1));
    }

}
