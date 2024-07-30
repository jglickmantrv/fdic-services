package com.nrv.fdic.domain.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages="jakarta.persistence")
@EnableJpaRepositories(basePackages = {"com.nrv.fdic.domain.repositories"})
public class DataSourceConfig {
}
