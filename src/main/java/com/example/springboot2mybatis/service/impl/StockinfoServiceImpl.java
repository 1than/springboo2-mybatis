package com.example.springboot2mybatis.service.impl;

import com.example.springboot2mybatis.entity.Stockinfo;
import com.example.springboot2mybatis.dao.StockinfoDAO;
import com.example.springboot2mybatis.service.StockinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ethan
 * @since 2019-09-22
 */
@Service
public class StockinfoServiceImpl extends ServiceImpl<StockinfoDAO, Stockinfo> implements StockinfoService {

}
