package com.example.hrms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.hrms.domain.Personnel;


public interface PersonnelService extends IService<Personnel> {


    boolean savePersonnel(Personnel personnel);
    boolean modify(Personnel personnel);
    boolean delete(Integer id);

    IPage<Personnel> getPage(int currentPage,int pageSize);

    IPage<Personnel> getPage(int currentPage, int pageSize, Personnel personnel);
}
