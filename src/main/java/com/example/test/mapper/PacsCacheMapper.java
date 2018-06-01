package com.example.test.mapper;

import com.example.test.entity.PacsCache;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PacsCacheMapper {
    int deleteByPrimaryKey(Integer pacId);

    int insert(PacsCache record);

    int insertSelective(PacsCache record);

    PacsCache selectByPrimaryKey(Integer pacId);

    int updateByPrimaryKeySelective(PacsCache record);

    int updateByPrimaryKey(PacsCache record);

    PacsCache getPacsCache(String accessPatId);
}