package com.example.springboo2mybatis;

import com.example.springboo2mybatis.beans.StockInfo;
import com.example.springboo2mybatis.dao.StockInfoDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Wrapper;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboo2MybatisApplicationTests {

    @Autowired
    private StockInfoDAO stockInfoDAO;

    @Test
    public void contextLoads() {
        List<StockInfo> lists = stockInfoDAO.selectList(null);

        System.out.println(lists);
    }

}
