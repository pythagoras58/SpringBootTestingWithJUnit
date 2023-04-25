package com.pythagorasweb.springwithtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringWithTestApplicationTests {

    @Test
    void contextLoads() {

    }


    @Test
    public void demoTestMethod(){
        assertTrue(true);
    }

}
