package com.vishal.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.vishal.springmvc")
@EnableWebMvc
public class AppConfig {

    // Bean to configure the DataSource (JDBC connection pool)
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/book");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds; // Return the DataSource bean
    }

    // Bean to configure the view resolver to resolve views (JSP files in this case)
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/"); // Prefix for JSP files
        resolver.setSuffix(".jsp"); // Suffix for JSP files
        return resolver; // Return the view resolver bean
    }
}
