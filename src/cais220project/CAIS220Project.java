/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu) 
 * (c) 2017
 * Created: Sep 20, 2017 9:23:05 AM 
 */
package cais220project;

import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author lizhayes-golding
 */
public class CAIS220Project extends Application {
   
    @Override
    public void start(Stage primaryStage) {
        HBox topRow = new HBox();
        DataSelectorPane dataSelectorPane = new DataSelectorPane();
        TimeSelectorPane timeSelectorPane = new TimeSelectorPane();
        topRow.getChildren().addAll(dataSelectorPane, timeSelectorPane);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topRow);
        
        EarthquakeDataFactory factory = new FakeEarthquakeDataFactory();
        List<EarthquakeData> data = factory.getData();
        EarthquakeTableView tableView = new EarthquakeTableView(FXCollections.observableArrayList(data));
        
        borderPane.setBottom(tableView);
        
        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Earthquake Data");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }

    
    public static void main(String[] args) {
        launch(args);
    }
   
}