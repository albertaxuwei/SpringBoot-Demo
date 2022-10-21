package com.example.hrms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hrms.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountDao extends BaseMapper<Account> {

    @Select("select *from tbl_account where username=#{username} and password=#{password}")
    public List<Account> findByUsernameAndPassword(String username,String password);
}
