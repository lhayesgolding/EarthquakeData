/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Nov 1, 2017 2:43:03 PM
 * 
 */
package cais220project;

import java.util.Date;
import javafx.beans.property.*;

/**
 *
 * @author lizhayes-golding
 */
public class EarthquakeData {
    
    private StringProperty location;
    private DoubleProperty magnitude;
    private ObjectProperty<Date> quakeTime;
    private DoubleProperty latitude;
    private DoubleProperty longitude;
    private DoubleProperty depth;
    private StringProperty url;

    public EarthquakeData() {
        location = new SimpleStringProperty();
        magnitude = new SimpleDoubleProperty();
        quakeTime = new SimpleObjectProperty<>();
        latitude = new SimpleDoubleProperty();
        longitude = new SimpleDoubleProperty();
        depth = new SimpleDoubleProperty();
        url = new SimpleStringProperty();
    }

    public EarthquakeData(String location, double magnitude, Date quakeTime, 
            double latitude, double longitude, double depth, String url) {
        this.location = new SimpleStringProperty(location);
        this.magnitude = new SimpleDoubleProperty(magnitude);
        this.quakeTime = new SimpleObjectProperty(quakeTime);
        this.latitude = new SimpleDoubleProperty(latitude);
        this.longitude = new SimpleDoubleProperty(longitude);
        this.depth =  new SimpleDoubleProperty(depth);
        this.url = new SimpleStringProperty(url);
    }

    
    public StringProperty locationProperty() {
        return location;
    }

    public String getLocation() {
        return location.get();
    }
    
    public void setLocation(String value) {
        location.set(value);
    }
    
    public DoubleProperty magnitudeProperty() {
        return magnitude;
    }
    
    public double getMagnitude() {
        return magnitude.get();
    }

    public void setMagntude(double value) {
        magnitude.set(value);
    }

    public ObjectProperty<Date> quakeTimeProperty() {
        return quakeTime;
    }
    
    public Date getQuakeTime() {
        return quakeTime.get();
    }

    public void setQuakeTime(Date value) {
        quakeTime.set(value);
    }

    public DoubleProperty latitudeProperty() {
        return latitude;
    }
    
    public double getLatitude() {
        return latitude.get();
    }

    public void setLatitude(double value) {
        latitude.set(value);
    }

    public DoubleProperty longitudeProperty() {
        return longitude;
    }

    public double getLongitude() {
        return longitude.get();
    }
    
    public void setLongitude(double value) {
        longitude.set(value);
    }

    public DoubleProperty depthProperty() {
        return depth;
    }

    public double getDepth() {
        return depth.get();
    }
    
    public void setDepth(double value) {
        depth.set(value);
    }

    public StringProperty urlProperty() {
        return url;
    }

    public String getUrl() {
        return url.get();
    }
    
    public void setUrl(String value) {
        url.set(value);
    }

    @Override
    public String toString() {
        return "EarthquakeData{" + "location=" + location + ", magnitude=" + magnitude + ", quakeTime=" + quakeTime + ", latitude=" + latitude + ", longitude=" + longitude + ", depth=" + depth + ", url=" + url + '}';
    }
    
}
