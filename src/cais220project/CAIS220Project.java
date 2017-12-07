/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding
 * (c) 2017
 * Created: Sep 20, 2017 9:23:05 AM 
 */
package cais220project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    List<EarthquakeData> data;
    EarthquakeTableView tableView;
    
    @Override
    public void start(Stage primaryStage) {
        HBox topRow = new HBox();
        DataSelectorPane dataSelectorPane = new DataSelectorPane();
        TimeSelectorPane timeSelectorPane = new TimeSelectorPane();
        topRow.getChildren().addAll(dataSelectorPane, timeSelectorPane);
        Button btSubmit = new Button("Submit");
        URL url = null;
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topRow);
        borderPane.setLeft(btSubmit);
        
       
        EarthquakeDataFactory factory = new GeoJSONEarthquakeDataFactory();
        try {
            url = new URL("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson");
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(CAIS220Project.class.getName()).log(Level.SEVERE, null, ex);
        }
        data = factory.getData(url);
        tableView = new EarthquakeTableView(FXCollections.observableArrayList(data));
        
        borderPane.setBottom(tableView);
        
        tableView.getColumns().addAll(tableView.getLocationColumn(), tableView.getMagnitudeColumn(),
                tableView.getDateAndTimeColumn(), tableView.getLatitudeColumn(),
                tableView.getLongitudeColumn(), tableView.getDepthColumn(),
                tableView.getUrlColumn());
        
        btSubmit.setOnMouseClicked(e -> {
            URL urlHour = null, urlDay = null, urlWeek = null, urlMonth = null;
            try {
                urlHour = new URL("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson");
                urlDay = new URL("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.geojson");
                urlWeek = new URL("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.geojson");
                urlMonth = new URL("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_month.geojson");
            } catch (MalformedURLException ex) {
                Logger.getLogger(CAIS220Project.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (timeSelectorPane.daySelected())  
                data = factory.getData(urlDay);
            else if (timeSelectorPane.weekSelected())
                data = factory.getData(urlWeek);
            else if (timeSelectorPane.monthSelected())
                data = factory.getData(urlMonth);
            else
                data = factory.getData(urlHour);
            tableView.setItems(FXCollections.observableArrayList(data));
    
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