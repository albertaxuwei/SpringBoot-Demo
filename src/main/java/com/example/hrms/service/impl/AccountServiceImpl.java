package com.example.hrms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hrms.dao.AccountDao;
import com.example.hrms.domain.Account;
import com.example.hrms.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountDao, Account> implements AccountService {
    @Autowired
    AccountDao accountDao;
    public boolean login(String username,String password){
        List<Account> accounts= accountDao.findByUsernameAndPassword(username,password);
        if (accounts!=null&&accounts.size()>0){
            return  true;
        }else{
            return false;
        }
    }
}
