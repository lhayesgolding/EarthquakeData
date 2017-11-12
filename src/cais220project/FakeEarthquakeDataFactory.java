/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Nov 1, 2017 3:03:07 PM
 * 
 */
package cais220project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lizhayes-golding
 */
public class FakeEarthquakeDataFactory extends EarthquakeDataFactory{

  @Override
  public List<EarthquakeData> getData() {
    ArrayList<EarthquakeData> list = new ArrayList<>(4);
    
    EarthquakeData data = new EarthquakeData("Albany, NY", new Date(), 4.3);
    list.add(data);
    Date now = new Date();
    list.add(new EarthquakeData("Lebanon, NH", new Date(now.getTime() - 24l*60*60*1000), 5.0));
    list.add(new EarthquakeData("Hartford, CT", new Date(now.getTime() - 3l*24*60*60*1000), 3.0));
    return list; 
  }
  
}
