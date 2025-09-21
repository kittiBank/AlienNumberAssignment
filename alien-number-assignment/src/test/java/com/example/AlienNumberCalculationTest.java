package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AlienNumberCalculationTest {

    @Test
    //To check input has in character list, result should be sum correctly
    public void testNormalNumbers() {
        assertEquals(3, AlienNumberCalculation.convertAlienToInt("AAA"));
        assertEquals(12, AlienNumberCalculation.convertAlienToInt("ZAA"));
        assertEquals(27, AlienNumberCalculation.convertAlienToInt("ZZBAA"));
    }

    @Test
    //To check input has in character list and subtraction case, result should be minus number correctly
    public void testSubtractionCases() {
        assertEquals(4, AlienNumberCalculation.convertAlienToInt("AB"));
        assertEquals(9, AlienNumberCalculation.convertAlienToInt("AZ"));
        assertEquals(40, AlienNumberCalculation.convertAlienToInt("ZL"));
        assertEquals(90, AlienNumberCalculation.convertAlienToInt("ZC"));
        assertEquals(400, AlienNumberCalculation.convertAlienToInt("CD"));
        assertEquals(900, AlienNumberCalculation.convertAlienToInt("CR"));
    }

    @Test
    //To check input has in character list, result should be return value correctly
    public void testSingleCharacter() {
        assertEquals(1, AlienNumberCalculation.convertAlienToInt("A"));
        assertEquals(5, AlienNumberCalculation.convertAlienToInt("B"));
        assertEquals(1000, AlienNumberCalculation.convertAlienToInt("R"));
    }

    @Test
    //To check input not in character list, result must be invalid
    public void testInvalidCases() {
        assertThrows(NullPointerException.class, () -> {
            AlienNumberCalculation.convertAlienToInt("X");
        });
    }
}
