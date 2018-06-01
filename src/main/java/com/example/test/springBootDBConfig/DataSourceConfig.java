package com.example.test.springBootDBConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 动态配置多个数据源
 * 多数据源配置类
 * LTF 2018/05/31
 */
@Configuration
public class DataSourceConfig {
    //数据源 postgre
    @Bean( name  = "postgresql")
    @ConfigurationProperties(prefix = "postgresql.datasource") // application.properteis 配置文件中的前缀
    public DataSource dataSourcePostgre(){
        return DataSourceBuilder.create().build();
    }

    @Bean( name  = "sqlserver")
    @ConfigurationProperties(prefix = "sqlserver.datasource") // application.properteis 配置文件中的前缀
    public DataSource dataSourceSqlserver(){
        return DataSourceBuilder.create().build();
    }

    /**
     * 动态数据源的配置,通过aop在不同数据源之间进行切换
     * @return
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource(){
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //默认数据源
        dynamicDataSource.setDefaultTargetDataSource(dataSourcePostgre());
        //配置多数据源
        Map<Object,Object> dsMap = new HashMap<>();
        dsMap.put("postgresql",dataSourcePostgre());
        dsMap.put("sqlserver",dataSourceSqlserver());
        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }


    /**
     * 配置@Transactional注解事物
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager(){
        return  new DataSourceTransactionManager(dynamicDataSource());
    }




}
