/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding
 * (c) 2017
 * Created: Sep 20, 2017 9:23:05 AM 
 */
package cais220project;

import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        Button btSubmit = new Button("Submit");
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topRow);
        borderPane.setLeft(btSubmit);
        
        //EarthquakeDataFactory factory = new FakeEarthquakeDataFactory();
        EarthquakeDataFactory factory = new GeoJSONEarthquakeDataFactory();
        List<EarthquakeData> data = factory.getData();
        EarthquakeTableView tableView = new EarthquakeTableView(FXCollections.observableArrayList(data));
        
        borderPane.setBottom(tableView);
        
        btSubmit.setOnMouseClicked(e -> {
            tableView.getColumns().clear();
            if (dataSelectorPane.locationSelected())
                tableView.getColumns().add(tableView.getLocationColumn());
            if (dataSelectorPane.magnitudeSelected())
                tableView.getColumns().add(tableView.getMagnitudeColumn());
            if (dataSelectorPane.dateAndTimeSelected())
                tableView.getColumns().add(tableView.getDateAndTimeColumn());
            if (dataSelectorPane.latitudeSelected())
                tableView.getColumns().add(tableView.getLatitudeColumn());
            if (dataSelectorPane.longitudeSelected())
                tableView.getColumns().add(tableView.getLongitudeColumn());
            if (dataSelectorPane.depthSelected()) 
                tableView.getColumns().add(tableView.getDepthColumn());
            if (dataSelectorPane.urlSelected())
                tableView.getColumns().add(tableView.getUrlColumn());
        });
        
        
        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Earthquake Data");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }
    
    public static void selectColumns() {
        
    }

    
    public static void main(String[] args) {
        launch(args);
    }
   
}