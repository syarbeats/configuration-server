package com.mts.cdc.blogappconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BlogAppConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogAppConfigApplication.class, args);
    }

}
