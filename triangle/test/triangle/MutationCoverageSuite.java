package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test Suite for the Statement Coverage.
 */
public class MutationCoverageSuite {

    @Test
    public void testZeroSideTriangle1() {
        Type actual = Triangle.classify(0, 10, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testZeroSideTriangle2() {
        Type actual = Triangle.classify(10, 0, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testZeroSideTriangle3() {
        Type actual = Triangle.classify(10, 10, 0);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
    
    @Test
    public void testNegativeSideTriangle1() {
        Type actual = Triangle.classify(-1, 10, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testNegativeSideTriangle2() {
        Type actual = Triangle.classify(10, -1, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testNegativeSideTriangle3() {
        Type actual = Triangle.classify(10, 10, -1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsoscelesAB() {
        Type actual = Triangle.classify(10, 10, 11);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsoscelesAC() {
        Type actual = Triangle.classify(10, 11, 10);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsoscelesBC() {
        Type actual = Triangle.classify(11, 10, 10);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void testInvalidIsoscelesAB() {
        Type actual = Triangle.classify(5, 5, 11);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInvalidIsoscelesAC() {
        Type actual = Triangle.classify(5, 11, 5);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInvalidIsoscelesBC() {
        Type actual = Triangle.classify(11, 5, 5);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testScaleneTriangle1() {
        Type actual = Triangle.classify(3, 4, 5);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }

    @Test
    public void testScaleneTriangle2() {
        Type actual = Triangle.classify(1, 2, 5);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testScaleneTriangle3() {
        Type actual = Triangle.classify(5, 1, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testScaleneTriangle4() {
        Type actual = Triangle.classify(1, 5, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInvalidTriangle() {
        Type actual = Triangle.classify(1, 1, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInvalidTriangle1() {
        Type actual = Triangle.classify(1, 1, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInvalidTriangle2() {
        Type actual = Triangle.classify(1, 2, 1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInvalidTriangle3() {
        Type actual = Triangle.classify(2, 1, 1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testEquilateralTriangle() {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutant0() {
        Type actual = Triangle.classify(0,0,0);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutant1() {
        Type actual = Triangle.classify(1, 2, 2);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }
    
    @Test
    public void testMutant2() {
        Type actual = Triangle.classify(2, 1, 2);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }
    
    @Test
    public void testMutant3() {
        Type actual = Triangle.classify(2, 2, 1);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutant4() {
        Type actual = Triangle.classify(2, 2, 1);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutant5() {
        Type actual = Triangle.classify(3, 4, 7);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutant6() {
        Type actual = Triangle.classify(4, 5, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutant7() {
        Type actual = Triangle.classify(10, 4, 5);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutant8() {
        Type actual = Triangle.classify(5, 10, 4);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutant9() {
        Type actual = Triangle.classify(1, 4, 3);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutant10() {
        Type actual = Triangle.classify(4, 1, 3);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutant11() {
        Type actual = Triangle.classify(10, 6, 5);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutant12() {
        Type actual = Triangle.classify(-2147483647, -2147483647, 1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
}
