/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Dec 12, 2017 2:01:11 PM
 * 
 */
package cais220project;

import javafx.stage.Stage;
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
public class CAIS220ProjectTest {
    
    public CAIS220ProjectTest() {
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
     * Test of start method, of class CAIS220Project.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Stage primaryStage = null;
        CAIS220Project instance = new CAIS220Project();
        instance.start(primaryStage);
        // Do I need this JUnit test? What do I need to test for?
    }

    
}
