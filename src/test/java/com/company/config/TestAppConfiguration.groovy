package com.company.config;

import com.company.dao.SimpleDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class TestAppConfiguration {

    @Bean
    @Primary
    public SimpleDao dummyDao() {
        return new SimpleDao("dummy simple dao");
    }
}
