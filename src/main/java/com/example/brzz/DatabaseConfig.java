package com.example.brzz;

import com.zaxxer.hikari.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Value("postgres://puucrawnhmapkq:bc72d4ffcd4328ef22bd85141a271852ca442b0197a644cbc6eee8b1eb325b46@ec2-52-203-74-38.compute-1.amazonaws.com:5432/debfu60hejnvvm")
    private String dbUrl;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
    }
}