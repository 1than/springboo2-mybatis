package com.example.springboot2mybatis.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot2mybatis.entity.Stockinfo;
import com.example.springboot2mybatis.service.StockinfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ethan
 * @since 2019-09-22
 */

@Slf4j
@RestController
@RequestMapping("/stockinfo")
public class StockinfoController {

    @Autowired
    private StockinfoService stockinfoService;

    @RequestMapping(value = "get/{page}")
    public IPage<Stockinfo> getData(@PathVariable(name = "page") long page) {

        log.info("page={}",page);
        IPage<Stockinfo> ipage = new Page<>();
        ipage.setPages(page);
        return stockinfoService.page(ipage);
    }

    @RequestMapping(value = "data/{id}")
    public Object getDataById(@PathVariable(name = "id") long id) {
        log.info("id={}",id);
        return stockinfoService.getById(id);
    }

    @RequestMapping(value = "testdata")
    public String testData() {
        return "test data";
    }



}

