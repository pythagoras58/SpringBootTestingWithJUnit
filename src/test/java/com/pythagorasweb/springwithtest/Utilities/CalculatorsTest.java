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
    }
}