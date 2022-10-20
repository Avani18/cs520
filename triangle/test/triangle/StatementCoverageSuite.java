package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test Suite for the Statement Coverage.
 */
public class StatementCoverageSuite {

    @Test
    public void testZeroSideTriangle1() {
        Type actual = Triangle.classify(0, 10, 10);
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
    public void testIsoscelesInvalid() {
        Type actual = Triangle.classify(2, 2, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testScaleneTriangle() {
        Type actual = Triangle.classify(3, 4, 5);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }

    @Test
    public void testInvalidTriangle1() {
        Type actual = Triangle.classify(4, 1, 2);
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
    public void testTriangleClass() {
        Triangle testTriangle = new Triangle();
        assertEquals(testTriangle.getClass(), Triangle.class);
    }

}
