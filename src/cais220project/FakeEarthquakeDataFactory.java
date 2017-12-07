/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Nov 1, 2017 3:03:07 PM
 * 
 */
package cais220project;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lizhayes-golding
 */
public class FakeEarthquakeDataFactory extends EarthquakeDataFactory {

    @Override
    public List<EarthquakeData> getData() {
        ArrayList<EarthquakeData> list = new ArrayList<>();
        list.add(new EarthquakeData("Atlanta, GA", 2.3, new Date(), 33.7490, 
                84.3880, 30, "http://www.sample.com"));
        Date now = new Date();
        list.add(new EarthquakeData("Deerfield, MA", 1.5, new Date(now.getTime() - 24l*60*60*1000),
                42.5446, 72.6056, 79.3, "http://www.example.com"));
        list.add(new EarthquakeData("Cincinnati, OH", 2.9, new Date(now.getTime() - 3l*24*60*60*1000),
               39.1031, 84.5120, 100, "http://www.ditto.com"));
        return list;
    }  

    @Override
    public List<EarthquakeData> getData(URL urlFile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}