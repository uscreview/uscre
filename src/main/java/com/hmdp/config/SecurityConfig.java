package com.hmdp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()          // 关闭 CSRF
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // 所有请求都允许访问
            );

        return http.build();
    }
}
