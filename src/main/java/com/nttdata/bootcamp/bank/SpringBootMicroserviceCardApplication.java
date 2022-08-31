package com.nttdata.bootcamp.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMicroserviceCardApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringBootMicroserviceCardApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceCardApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Init Card 8295");
    }

}