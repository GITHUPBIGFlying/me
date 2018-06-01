package com.example.test.springBootDBConfig;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

//    @Override
//    protected Object determineCurrentLookupKey() {
//        System.out.println("--->数据源为--->  " + DataSourceContextHolder.getDB());
//        return DataSourceContextHolder.getDB();
//    }

    @Override
    protected Object determineCurrentLookupKey() {
        System.out.println("数据源为"+DataSourceContextHolder.getDB());
        return DataSourceContextHolder.getDB();
    }


}
