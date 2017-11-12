/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu) 
 * (c) 2017
 * Created: Sep 20, 2017 9:23:05 AM 
 */
package cais220project;

import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu)
 */
public class CAIS220Project extends Application {
  
  @Override
  public void start(Stage primaryStage) {
    
    EarthquakeDataFactory factory = new FakeEarthquakeDataFactory();
    List<EarthquakeData> data = factory.getData();
    EarthquakeTableView tableView = new EarthquakeTableView(FXCollections.observableArrayList(data));
    
    Scene scene = new Scene(tableView, 300, 250);
    primaryStage.setTitle("Earthquake Table");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }
  
}
