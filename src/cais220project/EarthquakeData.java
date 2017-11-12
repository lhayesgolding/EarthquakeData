/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Nov 1, 2017 2:43:03 PM
 * 
 */
package cais220project;

import java.util.Date;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author lizhayes-golding
 */
public class EarthquakeData {

  private StringProperty location;
  private ObjectProperty<Date> quakeTime;
  private DoubleProperty magnitude;

  public EarthquakeData() {
    location = new SimpleStringProperty();
    quakeTime = new SimpleObjectProperty<>();
    magnitude = new SimpleDoubleProperty();
  }

  public EarthquakeData(String location, Date quakeTime, 
          double magnitude) {
    this.location = new SimpleStringProperty(location);
    this.quakeTime = new SimpleObjectProperty(quakeTime);
    this.magnitude = new SimpleDoubleProperty(magnitude);
  }

  
  public String getLocation() {
    return location.get();
  }

  public void setLocation(String value) {
    location.set(value);
  }

  public StringProperty locationProperty() {
    return location;
  }
  
  public double getMagnitude() {
    return magnitude.get();
  }

  public void setMagnitude(double value) {
    magnitude.set(value);
  }

  public DoubleProperty magnitudeProperty() {
    return magnitude;
  }

  public Date getQuakeTime() {
    return quakeTime.get();
  }

  public void setQuakeTime(Date value) {
    quakeTime.set(value);
  }

  public ObjectProperty quakeTimeProperty() {
    return quakeTime;
  }

  
  
  @Override
  public String toString() {
    return "EarthquakeData{" + "location=" + location + ", quakeTime=" + quakeTime + ", magnitude=" + magnitude + '}';
  }
  
}
