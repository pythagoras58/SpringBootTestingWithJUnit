package com.pythagorasweb.springwithtest.Utilities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorsTest {

    // instantiate the calculator class
    Calculators calculators;

    @BeforeEach
    void setUp(){
        calculators = new Calculators();
    }

    @Test
    void getProducts() {
        assertEquals(20, calculators.getProducts(4,5));
        assertEquals(0, calculators.getProducts(0,0));
    }

    @Test
    void getSummation(){
       assertEquals(40, calculators.getSummation(20,20));
       assertEquals(18, calculators.getSummation(10,8));
       assertEquals(0, calculators.getSummation(0,0));
    }
}