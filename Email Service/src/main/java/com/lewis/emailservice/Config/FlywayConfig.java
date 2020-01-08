//package com.lewis.emailservice.Config;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.flywaydb.core.Flyway;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class FlywayConfig {
//
//    @Value("${spring.datasource.driverClassName}")
//    private String datasourceDriverClassName;
//
//    @Value("${spring.datasource.url}")
//    private String datasourceUrl;
//
//    @Value("${spring.datasource.username}")
//    private String datasourceUsername;
//
//
//    @Value("${spring.datasource.password}")
//    private String datasourcePassword;
//
//    @Value("${spring.datasource.max-active}")
//    private int poolSize;
//
//    @Bean(name="flyway", initMethod = "migrate")
//    public Flyway flyway(){
//        final HikariDataSource ds = new HikariDataSource();
//        ds.setDriverClassName(datasourceDriverClassName);
//        ds.setJdbcUrl(datasourceUrl);
//        ds.setUsername(datasourceUsername);
//        ds.setPassword(datasourcePassword);
//        ds.setMaximumPoolSize(poolSize);
//
//        Flyway flyway = new Flyway();
//        flyway.setDataSource(ds);
//        //flyway.setBaselineVersionAsString(startVersion);
//        flyway.setBaselineOnMigrate(true);
//        flyway.repair();
//        flyway.migrate();
//        return flyway;
//    }
//}
//
////import org.flywaydb.core.Flyway;
////import com.zaxxer.hikari.HikariDataSource;
////import org.springframework.beans.factory.annotation.Value;
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////
////@Configuration
////public class FlywayConfig {
////    @Value("${spring.datasource.driverClassName}")
////    private String datasourceDriverClassName;
////
////    @Value("${spring.datasource.url}")
////    private String datasourceUrl;
////
////    @Value("${spring.datasource.username}")
////    private String datasourceUsername;
////
////
////    @Value("${spring.datasource.password}")
////    private String datasourcePassword;
////
////    @Value("${spring.datasource.max-active}")
////    private int poolSize;
////
//////    @Value("${schema.migration.start.version}")
//////    private String startVersion;
////
////
////    @Bean(name = "dbMigrationService", initMethod = "migrate")
////    public Flyway dbMigrationService() {
////        final HikariDataSource ds = new HikariDataSource();
////        ds.setDriverClassName(datasourceDriverClassName);
////        ds.setJdbcUrl(datasourceUrl);
////        ds.setUsername(datasourceUsername);
////        ds.setPassword(datasourcePassword);
////        ds.setMaximumPoolSize(poolSize);
////
////        Flyway flyway = new Flyway();
////        flyway.setDataSource(ds);
////        //flyway.setBaselineVersionAsString(startVersion);
////        flyway.setBaselineOnMigrate(true);
////        flyway.repair();
////        flyway.migrate();
////        return flyway;
////    }
////}
