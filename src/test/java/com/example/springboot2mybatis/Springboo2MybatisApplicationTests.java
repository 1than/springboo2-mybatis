package com.example.springboot2mybatis;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot2mybatis.dao.StockinfoDAO;
import com.example.springboot2mybatis.entity.Stockinfo;
import com.example.springboot2mybatis.service.StockinfoService;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboo2MybatisApplicationTests {

    @Autowired
    private StockinfoService stockinfoService;

    @Autowired
    private StockinfoDAO stockinfoDAO;


    /**
     *
     * getById
     *
     */
    @Test
    public void test1() {
        Stockinfo stockinfo = stockinfoService.getById(10);
        System.out.println(stockinfo);
    }


    /**
     *
     * listObjs
     *
     */
    @Test
    public void test2() {
        QueryWrapper condition = new QueryWrapper();
        condition.eq("stock_name","浦发银行");

        List<Stockinfo> lists = new ArrayList<>();

        lists = stockinfoService.listObjs(condition);

        System.out.println(lists.size());
        System.out.println(lists);
    }

    /**
     *
     * list,遍历指定条件查询
     *
     */
    @Test
    public void test3() {
        QueryWrapper condition = new QueryWrapper<>();
        condition.eq("id",10);

        List<Stockinfo> lists = stockinfoService.list(condition);

        System.out.println(lists);
    }


    /**
     *
     * list，查询所有
     *
     */
    @Test
    public void test4() {
        List<Stockinfo> list = stockinfoService.list();

        System.out.println("数据大小...");
        System.out.println(list.size());
    }


    /**
     *
     * count
     *
     */
    @Test
    public void test5() {
        int count = stockinfoService.count();

        System.out.println(count);
    }


    /**
     *
     * listByMap,仅限于同一张表的多个字段执行条件查询,map中的key指向数据库的字段名
     *
     */
    @Test
    public void test6() {
        Map<String, Object> paramsMap = new HashMap<>();
        paramsMap.put("id", 3);
        List<Stockinfo> lists = (List<Stockinfo>) stockinfoService.listByMap(paramsMap);

        lists.forEach(System.out::println);
    }

    /**
     *
     * 分页查询
     *
     */
    @Test
    public void test7 () {
        QueryWrapper<Stockinfo> condition = new QueryWrapper<>();
        //condition.eq("stock_name", "浦发银行");

        Page<Stockinfo> pageObj = new Page<>(2,10);

        IPage<Stockinfo> listPage = stockinfoDAO.selectPage(pageObj, condition);

        System.out.println("size = " + listPage.getSize());
        System.out.println("page = " + listPage.getPages());
        System.out.println("total = " + listPage.getTotal());
        System.out.println("获取记录...");
        System.out.println(listPage.getRecords());
    }

}
