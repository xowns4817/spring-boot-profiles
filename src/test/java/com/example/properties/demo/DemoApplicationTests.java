package com.example.properties.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Value("${spring.profiles.active}")
    private String profile;

    @Test
    void contextLoads() {
        System.out.println("profile:" + profile);
    }

}
