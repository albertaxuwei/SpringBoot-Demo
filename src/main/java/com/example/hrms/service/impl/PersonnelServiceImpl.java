package com.example.hrms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hrms.dao.PersonnelDao;
import com.example.hrms.domain.Personnel;
import com.example.hrms.service.PersonnelService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonnelServiceImpl extends ServiceImpl<PersonnelDao, Personnel> implements PersonnelService {

    @Autowired
    private PersonnelDao personnelDao;

    @Override
    public boolean savePersonnel(Personnel prsonnel) {
        return personnelDao.insert(prsonnel)>0;
    }

    @Override
    public boolean modify(Personnel book) {
        return personnelDao.updateById(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return personnelDao.deleteById(id)>0;
    }

    @Override
    public IPage<Personnel> getPage(int currentPage, int pageSize) {
    IPage page = new Page(currentPage,pageSize);
    personnelDao.selectPage(page,null);
    return page;
    }

    @Override
    public IPage<Personnel> getPage(int currentPage, int pageSize, Personnel personnel) {
        LambdaQueryWrapper<Personnel> lqw = new LambdaQueryWrapper<Personnel>();
        lqw.like(Strings.isNotEmpty(personnel.getType()),Personnel::getType,personnel.getType());
        lqw.like(Strings.isNotEmpty(personnel.getName()),Personnel::getName,personnel.getName());
        lqw.like(Strings.isNotEmpty(personnel.getDescription()),Personnel::getDescription,personnel.getDescription());
        IPage page = new Page(currentPage,pageSize);
        personnelDao.selectPage(page,lqw);
        return page;
    }
}