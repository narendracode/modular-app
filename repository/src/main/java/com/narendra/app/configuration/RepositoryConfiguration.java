package com.narendra.app.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages ={"com.narendra.app.repository"})
@EntityScan(basePackages = {"com.narendra.app.entity"})
@ComponentScan(basePackages = {"com.narendra.app"})
public class RepositoryConfiguration {
}
