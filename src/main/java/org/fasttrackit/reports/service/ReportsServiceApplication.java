package org.fasttrackit.reports.service;

import org.fasttrackit.person.client.resttemplate.config.PersonClientRTConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "org.fasttrackit.reports.service",
        "org.fasttrackit.person.client.resttemplate"
})
@EnableConfigurationProperties(value = PersonClientRTConfig.class)
public class ReportsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportsServiceApplication.class, args);
    }

}
