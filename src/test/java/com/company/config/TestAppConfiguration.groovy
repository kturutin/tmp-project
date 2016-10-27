package com.company.config;

import com.company.dao.FirstDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class TestAppConfiguration {

    @Bean
    @Primary
    public FirstDao dummyDao() {
        return new FirstDao("dummy simple dao");
    }
}
