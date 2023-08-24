package org.example;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CalculatorTests {

    @BeforeClass
    public static void beforeClassStartTestTime() {
        System.out.println("Test class has been started at: " + System.currentTimeMillis());
    }

    @AfterClass
    public static void afterClassStartTestTime() {
        System.out.println("Test class has been finished at: " + System.currentTimeMillis());
    }

    @Before
    public void beforeStartTestTime() {
        System.out.println("Test has been started at: " + System.currentTimeMillis());
    }

    @After
    public void afterStartTestTime() {
        System.out.println("Test has been finished at: " + System.currentTimeMillis());
    }

    @Test
    public void testAddition(){
        //Given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        //When

        int result = calculator.addition(a,b);
        //Then
        int expected = 8;
        assertEquals(expected, result);
    }
    @Test
    public void testSubtraction(){
        //Given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        //When

        int result = calculator.subtraction(a,b);
        //Then
        int expected = 2;
        assertEquals(expected, result);
    }
    @Test
    public void testMultiplication(){
        //Given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        //When

        int result = calculator.multiplication(a,b);
        //Then
        int expected = 15;
        assertEquals(expected, result);
    }
    @Test
    public void testDivision(){
        //Given
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 1;
        //When

        double result = calculator.division(a,b);

        //Then
        double expected = 2;
        assertEquals(expected, result, 0.001);
    }
    @Test
    public void testDivisionByZero(){
        //Given
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 0;
        //When&Then

       assertThrows(IllegalArgumentException.class, () -> {
           calculator.division(a,b);
       });
    }

}
