/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Dec 12, 2017 1:28:08 PM
 * 
 */
package cais220project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lizhayes-golding
 */
public class DataSelectorPaneTest {
    
    public DataSelectorPaneTest() {
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
     * Test of locationSelected method, of class DataSelectorPane.
     */
    @Test
    public void testLocationSelected() {
        System.out.println("locationSelected");
        DataSelectorPane instance = new DataSelectorPane();
        boolean expResult = true;
        boolean result = instance.locationSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of magnitudeSelected method, of class DataSelectorPane.
     */
    @Test
    public void testMagnitudeSelected() {
        System.out.println("magnitudeSelected");
        DataSelectorPane instance = new DataSelectorPane();
        boolean expResult = true;
        boolean result = instance.magnitudeSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of dateAndTimeSelected method, of class DataSelectorPane.
     */
    @Test
    public void testDateAndTimeSelected() {
        System.out.println("dateAndTimeSelected");
        DataSelectorPane instance = new DataSelectorPane();
        boolean expResult = true;
        boolean result = instance.dateAndTimeSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of latitudeSelected method, of class DataSelectorPane.
     */
    @Test
    public void testLatitudeSelected() {
        System.out.println("latitudeSelected");
        DataSelectorPane instance = new DataSelectorPane();
        boolean expResult = true;
        boolean result = instance.latitudeSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of longitudeSelected method, of class DataSelectorPane.
     */
    @Test
    public void testLongitudeSelected() {
        System.out.println("longitudeSelected");
        DataSelectorPane instance = new DataSelectorPane();
        boolean expResult = true;
        boolean result = instance.longitudeSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of depthSelected method, of class DataSelectorPane.
     */
    @Test
    public void testDepthSelected() {
        System.out.println("depthSelected");
        DataSelectorPane instance = new DataSelectorPane();
        boolean expResult = true;
        boolean result = instance.depthSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of urlSelected method, of class DataSelectorPane.
     */
    @Test
    public void testUrlSelected() {
        System.out.println("urlSelected");
        DataSelectorPane instance = new DataSelectorPane();
        boolean expResult = true;
        boolean result = instance.urlSelected();
        assertEquals(expResult, result);
    }
    
}
