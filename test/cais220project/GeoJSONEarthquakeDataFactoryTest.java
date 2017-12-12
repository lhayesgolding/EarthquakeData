/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Dec 12, 2017 10:54:11 AM
 * 
 */
package cais220project;

import java.util.List;
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
public class GeoJSONEarthquakeDataFactoryTest {

    public GeoJSONEarthquakeDataFactoryTest() {
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
     * Test of getData method, of class GeoJSONEarthquakeDataFactory.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        GeoJSONEarthquakeDataFactory instance
                = new GeoJSONEarthquakeDataFactory();
        List<EarthquakeData> result = instance.getData("significant_week.geojson");
        assertTrue(result.size() > 0);
        result.forEach((data) -> {
            assertTrue(null != data.getQuakeTime());
            assertTrue(null != data.getLocation());
            assertTrue(data.getLocation().length() > 0);
            assertTrue(data.getMagnitude() < 10);
            assertTrue(data.getMagnitude() > -1);
            assertTrue(data.getDepth() > -10);
            assertTrue(data.getLatitude() >= -90);
            assertTrue(data.getLatitude() <= 90);
            assertTrue(data.getLongitude() >= -180);
            assertTrue(data.getLongitude() <= 180);
            assertTrue(data.getUrl().length() > 0);
        });
    }

}
