package com.medulahekim.medula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.medulahekim.medula.repo")
public class MedulaHekimApplication {

    public static void main(String[] args) {

        SpringApplication.run(MedulaHekimApplication.class, args);

    }
}
