package com.geekster.UrlHitCounter;

import com.geekster.UrlHitCounter.entity.Visitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSource {

    @Bean
    Map<Integer, Visitor> getVisitorSource()
    {
        return new HashMap<>();
    }
}
