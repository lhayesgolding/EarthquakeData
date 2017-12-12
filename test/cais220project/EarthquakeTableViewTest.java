/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Dec 12, 2017 2:05:43 PM
 * 
 */
package cais220project;

import javafx.scene.control.TableColumn;
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
public class EarthquakeTableViewTest {
    
    public EarthquakeTableViewTest() {
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
     * Test of setColumns method, of class EarthquakeTableView.
     */
    @Test
    public void testSetColumns() {
        System.out.println("setColumns");
        EarthquakeTableView instance = new EarthquakeTableView();
        instance.setColumns();
        //What to test for?
    }

    /**
     * Test of getLocationColumn method, of class EarthquakeTableView.
     */
    @Test
    public void testGetLocationColumn() { //Pass in a list here? 
        
        System.out.println("getLocationColumn");
        EarthquakeTableView instance = new EarthquakeTableView();
        TableColumn expResult = null;
        TableColumn result = instance.getLocationColumn();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getMagnitudeColumn method, of class EarthquakeTableView.
     */
    @Test
    public void testGetMagnitudeColumn() {
        System.out.println("getMagnitudeColumn");
        EarthquakeTableView instance = new EarthquakeTableView();
        TableColumn expResult = null;
        TableColumn result = instance.getMagnitudeColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateAndTimeColumn method, of class EarthquakeTableView.
     */
    @Test
    public void testGetDateAndTimeColumn() {
        System.out.println("getDateAndTimeColumn");
        EarthquakeTableView instance = new EarthquakeTableView();
        TableColumn expResult = null;
        TableColumn result = instance.getDateAndTimeColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLatitudeColumn method, of class EarthquakeTableView.
     */
    @Test
    public void testGetLatitudeColumn() {
        System.out.println("getLatitudeColumn");
        EarthquakeTableView instance = new EarthquakeTableView();
        TableColumn expResult = null;
        TableColumn result = instance.getLatitudeColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLongitudeColumn method, of class EarthquakeTableView.
     */
    @Test
    public void testGetLongitudeColumn() {
        System.out.println("getLongitudeColumn");
        EarthquakeTableView instance = new EarthquakeTableView();
        TableColumn expResult = null;
        TableColumn result = instance.getLongitudeColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepthColumn method, of class EarthquakeTableView.
     */
    @Test
    public void testGetDepthColumn() {
        System.out.println("getDepthColumn");
        EarthquakeTableView instance = new EarthquakeTableView();
        TableColumn expResult = null;
        TableColumn result = instance.getDepthColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrlColumn method, of class EarthquakeTableView.
     */
    @Test
    public void testGetUrlColumn() {
        System.out.println("getUrlColumn");
        EarthquakeTableView instance = new EarthquakeTableView();
        TableColumn expResult = null;
        TableColumn result = instance.getUrlColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
