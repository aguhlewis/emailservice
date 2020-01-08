//package com.lewis.emailservice.Config;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DatasourceConfig {
//
//    @Value("${spring.datasource.driverClassName}")
//    private String dataSourceDriverClassName;
//    @Value("${spring.datasource.url}")
//    private String dataSourceUrl;
//    @Value("${spring.datasource.username}")
//    private String dataSourceUserName;
//    @Value("${spring.datasource.password}")
//    private String dataSourcePassword;
//
//    @Bean(name = "criticsDatasource")
//    @Primary
//    @ConfigurationProperties(prefix="datasource.primary")
//    public DataSource datasource() throws Exception {
//
//        ComboPooledDataSource comboPooledDataSource  = new ComboPooledDataSource();
//        comboPooledDataSource.setDriverClass(dataSourceDriverClassName);
//        comboPooledDataSource.setJdbcUrl(dataSourceUrl);
//        comboPooledDataSource.setUser(dataSourceUserName);
//        comboPooledDataSource.setPassword(dataSourcePassword);
//
//        return comboPooledDataSource;
//    }
//
//}
