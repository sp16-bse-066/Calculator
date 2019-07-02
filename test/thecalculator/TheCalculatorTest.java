package thecalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TheCalculatorTest
{
    public TheCalculatorTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of Add method, of class TheCalculator.
     */
    @Test
    public void testAdd()
    {
        TheCalculator obj= new TheCalculator();
        assertEquals(2, obj.Add(20, 2));
    }

    /**
     * Test of Sub method, of class TheCalculator.
     */
    @Test
    public void testSub()
    {
        TheCalculator obj= new TheCalculator();
        assertNotEquals(10, obj.Sub(20, 2));
    }

    /**
     * Test of Mul method, of class TheCalculator.
     */
    @Test
    public void testMul()
    {
        TheCalculator obj= new TheCalculator();
        assertEquals(40, obj.Mul(20, 2));
    }

    /**
     * Test of Div method, of class TheCalculator.
     */
    @Test
    public void testDiv()
    {
        TheCalculator obj= new TheCalculator();
        assertEquals(10, obj.Div(20, 2)); 
    }

    /**
     * Test of main method, of class TheCalculator.
     */
}
