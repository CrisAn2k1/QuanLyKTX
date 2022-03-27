package com.duongan.QuanLyKTX.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

public class DatabaseConfig {
    @Value("${db.datasource.url}")
    private String dbUrl;
    @Value("${db.datasource.driver-class-name}")
    private String driverClassName;
    @Value("${db.datasource.username}")
    private String userName;
    @Value("${db.datasource.password}")
    private String password;

    @Bean(name = "dataSource")
    public DataSource dataSource(){
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(dbUrl);
        hikariConfig.setDriverClassName(driverClassName);
        hikariConfig.setUsername(userName);
        hikariConfig.setPassword(password);

        HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);
        return hikariDataSource;
    }

    @Bean(name = "transactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager (){
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {

        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResource("classpath:com/duongan/QuanLyKTX/mapper/sql/*.xml"));
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        sqlSessionFactoryBean.setConfiguration(configuration);
        return sqlSessionFactoryBean.getObject();
    }

}
