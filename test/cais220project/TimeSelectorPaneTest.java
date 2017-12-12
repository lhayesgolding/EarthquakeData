/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Dec 12, 2017 1:53:30 PM
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
public class TimeSelectorPaneTest {
    
    public TimeSelectorPaneTest() {
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
     * Test of hourSelected method, of class TimeSelectorPane.
     */
    @Test
    public void testHourSelected() {
        System.out.println("hourSelected");
        TimeSelectorPane instance = new TimeSelectorPane();
        boolean expResult = true;
        boolean result = instance.hourSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of daySelected method, of class TimeSelectorPane.
     */
    @Test
    public void testDaySelected() {
        System.out.println("daySelected");
        TimeSelectorPane instance = new TimeSelectorPane();
        boolean expResult = false;
        boolean result = instance.daySelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of weekSelected method, of class TimeSelectorPane.
     */
    @Test
    public void testWeekSelected() {
        System.out.println("weekSelected");
        TimeSelectorPane instance = new TimeSelectorPane();
        boolean expResult = false;
        boolean result = instance.weekSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of monthSelected method, of class TimeSelectorPane.
     */
    @Test
    public void testMonthSelected() {
        System.out.println("monthSelected");
        TimeSelectorPane instance = new TimeSelectorPane();
        boolean expResult = false;
        boolean result = instance.monthSelected();
        assertEquals(expResult, result);
    }
    
}
