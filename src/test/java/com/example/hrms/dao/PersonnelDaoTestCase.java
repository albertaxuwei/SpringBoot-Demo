package com.example.hrms.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.hrms.domain.Personnel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonnelDaoTestCase {
@Autowired
private PersonnelDao personnelDao;
//编写测试用例
    @Test
    void testGetById(){
        System.out.println(personnelDao.selectById(1));
    }
    @Test
    void testQueryAll(){
        personnelDao.selectList(null);
    }
    @Test
    void testQueryByCondition(){
        String name = "1";
        LambdaQueryWrapper<Personnel> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(true,Personnel::getName,name);
        personnelDao.selectList(lambdaQueryWrapper);
    }
    @Test
    void testSave(){

    }
    @Test
    void testUpdate(){

    }
    @Test
    void testDelete(){
        personnelDao.deleteById(13);
    }
    @Test
    void testGetPage(){
    IPage<Personnel> page = new Page<>(1,5);
    personnelDao.selectPage(page,null);
    System.out.println(page.getCurrent());
    System.out.println(page.getSize());
    System.out.println(page.getTotal());
    System.out.println(page.getPages());
    System.out.println(page.getRecords());
    }


}
