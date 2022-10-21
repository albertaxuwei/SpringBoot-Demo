package com.example.hrms.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.hrms.controller.utils.Result;
import com.example.hrms.domain.Personnel;
import com.example.hrms.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personnels")
public class PersonnelController {

    @Autowired
    private PersonnelService personnelService;

    @GetMapping
    public Result queryAll(){
        return new Result(true, personnelService.list());
    }

    @PostMapping
    public Result save(@RequestBody Personnel personnel){
        return new Result(personnelService.save(personnel));
    }

    @PutMapping
    public Result update(@RequestBody Personnel personnel){
        return new Result(personnelService.modify(personnel));
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        return new Result(personnelService.delete(id));
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        return new Result(true, personnelService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage,@PathVariable int pageSize,Personnel personnel){
        IPage<Personnel> page = personnelService.getPage(currentPage, pageSize,personnel);
        //如果当前页码值大于总页码数，那么重新执行查询操作，使用最大页码值作为当前页码值。
        if (currentPage > page.getPages()){
            page = personnelService.getPage((int)page.getPages(),pageSize);
        }
        return new Result(true, personnelService.getPage(currentPage,pageSize,personnel));
    }

}