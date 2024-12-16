package com.tech.EPL.bus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();  // RestTemplate 빈 생성
    }

    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();  // WebClient.Builder를 빈으로 등록
    }
    
}