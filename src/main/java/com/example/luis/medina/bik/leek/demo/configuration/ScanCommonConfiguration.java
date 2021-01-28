package com.example.luis.medina.bik.leek.demo.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {
    "com.example.luis.medina.bik.leek.demo.domain",
}
)
@EnableJpaRepositories(basePackages = {"com.example.luis.medina.bik.leek.demo.repository"})
@ComponentScan(basePackages = {
    "com.example.luis.medina.bik.leek.demo.mapper",
})
public class ScanCommonConfiguration {
}
