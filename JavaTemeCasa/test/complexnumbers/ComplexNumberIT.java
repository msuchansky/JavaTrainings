/*
 * JUnit generated class for ComplexNumber
 * 
 * 
 */
package complexnumbers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miro
 */
public class ComplexNumberIT {
    
    public ComplexNumberIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class ComplexNumber.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ComplexNumber instance = new ComplexNumber(10.2, 5.1 );
        String expResult = "10.2+5.1i";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class ComplexNumber.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ComplexNumber instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ComplexNumber.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ComplexNumber instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conjugate method, of class ComplexNumber.
     */
    @Test
    public void testConjugate() {
        System.out.println("conjugate");
        ComplexNumber initialNumber = null;
        ComplexNumber expResult = null;
        ComplexNumber result = ComplexNumber.conjugate(initialNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ComplexNumber.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        ComplexNumber b = null;
        ComplexNumber instance = null;
        ComplexNumber expResult = null;
        ComplexNumber result = instance.add(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class ComplexNumber.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        ComplexNumber b = null;
        ComplexNumber instance = null;
        ComplexNumber expResult = null;
        ComplexNumber result = instance.substract(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIm method, of class ComplexNumber.
     */
    @Test
    public void testGetIm() {
        System.out.println("getIm");
        ComplexNumber instance = null;
        double expResult = 0.0;
        double result = instance.getIm();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIm method, of class ComplexNumber.
     */
    @Test
    public void testSetIm() {
        System.out.println("setIm");
        double im = 0.0;
        ComplexNumber instance = null;
        instance.setIm(im);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRe method, of class ComplexNumber.
     */
    @Test
    public void testGetRe() {
        System.out.println("getRe");
        ComplexNumber instance = null;
        double expResult = 0.0;
        double result = instance.getRe();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRe method, of class ComplexNumber.
     */
    @Test
    public void testSetRe() {
        System.out.println("setRe");
        double re = 0.0;
        ComplexNumber instance = null;
        instance.setRe(re);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of intValue method, of class ComplexNumber.
     */
    @Test
    public void testIntValue() {
        System.out.println("intValue");
        ComplexNumber instance = null;
        int expResult = 0;
        int result = instance.intValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longValue method, of class ComplexNumber.
     */
    @Test
    public void testLongValue() {
        System.out.println("longValue");
        ComplexNumber instance = null;
        long expResult = 0L;
        long result = instance.longValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of floatValue method, of class ComplexNumber.
     */
    @Test
    public void testFloatValue() {
        System.out.println("floatValue");
        ComplexNumber instance = null;
        float expResult = 0.0F;
        float result = instance.floatValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doubleValue method, of class ComplexNumber.
     */
    @Test
    public void testDoubleValue() {
        System.out.println("doubleValue");
        ComplexNumber instance = null;
        double expResult = 0.0;
        double result = instance.doubleValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
