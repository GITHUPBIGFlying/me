package com.example.test.service.impl;

import com.example.test.entity.PacsCache;
import com.example.test.mapper.PacsCacheMapper;
import com.example.test.service.PacsCacheService;
import com.example.test.springBootDBConfig.DS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacsCacheServiceImpl implements PacsCacheService {

    @Autowired
   private PacsCacheMapper pacsCacheMapper;
    //使用数据源 sqlserver 查询
    @DS("sqlserver")
    public PacsCache getPacsCache(String accessPatId){
        return pacsCacheMapper.getPacsCache(accessPatId);
    }
}
