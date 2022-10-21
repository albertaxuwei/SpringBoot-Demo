package com.example.hrms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.hrms.domain.Account;

public interface AccountService extends IService<Account> {
    public boolean login(String username,String password);
}
