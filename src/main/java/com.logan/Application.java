package com.logan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/13
 * @description TODO
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Logger logger = LoggerFactory.getLogger(Application.class);
        logger.info("asd");
    }
}
