package Excercise1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    private Object assertEquals;
    @Test
    @DisplayName("Test TriangleClassifier ")
    public void testEquilateral (){
        int a = 2;
        int b = 2;
        int c = 2;
       String expected = "TriangleEquilateral";
        String result = TriangleClassifier.TriangleClassifiers(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    public void testEquilateral1(){
        int a = 3;
        int b = 3;
        int c = 3;
        String expected = "TriangleEquilateral";
        String result = TriangleClassifier.TriangleClassifiers(a,b,c);
        assertEquals(expected,result);

    }

    @Test
    public void testIsoscelesTriangle(){
        int a = 2;
        int b = 2;
        int c = 5;
        String expected = "IsoscelesTriangle";
        String result = TriangleClassifier.isoscelesTriangle(a,b,c);
        assertEquals(expected,result);

    }
    @Test
    public void testNormalTriangle() {
        int a = 2;
        int b = 3;
        int c = 4;
        String expected = "IsoscelesTriangle";
        String result = TriangleClassifier.normalTriangle(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    public void testNotATriangle() {
        int a = 8;
        int b = 3;
        int c = 5;
        String expected = "IsoscelesTriangle";
        String result = TriangleClassifier.notATriangle(a, b, c);
        assertEquals(expected, result);
    }
}
