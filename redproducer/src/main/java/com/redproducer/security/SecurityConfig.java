package com.redproducer.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Deshabilita CSRF (solo si no usas formularios)
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // Permitir TODAS las peticiones sin autenticación
            );
        return http.build();
    }
}
