/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Dec 3, 2017 5:23:50 PM
 * 
 */
package cais220project;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.geojson.Feature;
import org.geojson.FeatureCollection;
import java.net.URL;
import org.geojson.LngLatAlt;
import org.geojson.Point;

/**
 * Class GeoJSONEarthquakeDataFactory
 *
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu)
 */
public class GeoJSONEarthquakeDataFactory
        extends EarthquakeDataFactory {

    static private final String LOCATION_KEY = "place";
    static private final String MAGNITUDE_KEY = "mag";
    static private final String QUAKETIME_KEY = "time";
    static private final String URL_KEY = "url";

    @Override
    public List<EarthquakeData> getData(URL urlFile) {
        /**URL urlFile = null;
        try {
            
            urlFile = new URL("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson");
        } catch (MalformedURLException ex) {
            Logger.getLogger(GeoJSONEarthquakeDataFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
            
        ArrayList<EarthquakeData> list = null;
        try (InputStream in = urlFile.openStream();) {
          
            FeatureCollection featureCollection
                    = new ObjectMapper().readValue(in, FeatureCollection.class);
            list = new ArrayList<>();
            for (Feature f : featureCollection) {
                String location = f.getProperty(LOCATION_KEY);
                Number magnitude = f.getProperty(MAGNITUDE_KEY);
                Long epochQuakeTime = f.getProperty(QUAKETIME_KEY);
                String url = f.getProperty(URL_KEY);
                if (null == location || null == magnitude
                        || null == epochQuakeTime) {
                    System.err.println("Invalid data " + f.toString());
                    continue;
                }
                Point point = (Point)f.getGeometry();
                LngLatAlt lla = point.getCoordinates(); 
                double latitude = lla.getLatitude();
                double longitude = lla.getLongitude();
                double depth = lla.getAltitude();
                
                EarthquakeData data = new EarthquakeData(location,magnitude.doubleValue(),
                        new Date(epochQuakeTime), latitude, longitude, depth, url);
                list.add(data);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeoJSONEarthquakeDataFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeoJSONEarthquakeDataFactory.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return list;
    }

    /**
    public static void main(String[] args) {
        EarthquakeDataFactory factory
                = new GeoJSONEarthquakeDataFactory();
        List<EarthquakeData> list = factory.getData();
        list.forEach((earthquakeData) -> {
            System.out.println(earthquakeData.toString());
        });
    }
    */
    
    @Override
    public List<EarthquakeData> getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
