package com.redproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories("com.redproducer.repositories") // Especifica la ubicación de los repositorios
@EntityScan("com.redproducer.models") // Especifica la ubicación de las entidades
public class RedproducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedproducerApplication.class, args);
    }
}
