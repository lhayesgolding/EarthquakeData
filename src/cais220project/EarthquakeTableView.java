/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Nov 1, 2017 3:26:24 PM
 * 
 */
package cais220project;

import java.text.SimpleDateFormat;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

/**
 *
 * @author lizhayes-golding
 */
public class EarthquakeTableView extends TableView<EarthquakeData> {
    
    private TableColumn locationColumn;
    private TableColumn magnitudeColumn;
    private TableColumn quakeTimeColumn;
    private TableColumn latitudeColumn;
    private TableColumn longitudeColumn;
    private TableColumn depthColumn;
    private TableColumn urlColumn;

    
    public EarthquakeTableView() {
        setColumns();
    }

    public EarthquakeTableView(ObservableList<EarthquakeData> items) {
        super(items);
        setColumns();
    }

    public void setColumns() {
        locationColumn = new TableColumn("Location");
        locationColumn.setMinWidth(50);
        locationColumn.setCellValueFactory(
                new PropertyValueFactory<EarthquakeData, String>("location"));

        magnitudeColumn = new TableColumn("Magnitude");
        locationColumn.setMinWidth(10);
        magnitudeColumn.setCellValueFactory(
                new PropertyValueFactory<EarthquakeData, Double>("magnitude"));

        quakeTimeColumn = new TableColumn("Earthquake Time");
        quakeTimeColumn.setMinWidth(20);
        quakeTimeColumn.setCellValueFactory(
                new Callback<TableColumn.CellDataFeatures<EarthquakeData, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(
                    TableColumn.CellDataFeatures<EarthquakeData, String> param) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd, HH:mm:ss");
                String quakeDate = dateFormat.format(
                        param.getValue().getQuakeTime());
                return new SimpleStringProperty(quakeDate);
            }
        });

        latitudeColumn = new TableColumn("Latitude");
        latitudeColumn.setMinWidth(20);
        latitudeColumn.setCellValueFactory(
                new PropertyValueFactory<EarthquakeData, Double>("latitude"));

        longitudeColumn = new TableColumn("Longitude");
        longitudeColumn.setMinWidth(20);
        longitudeColumn.setCellValueFactory(
                new PropertyValueFactory<EarthquakeData, Double>("longitude"));

        depthColumn = new TableColumn("Depth");
        depthColumn.setMinWidth(10);
        depthColumn.setCellValueFactory(
                new PropertyValueFactory<EarthquakeData, Double>("depth"));

        urlColumn = new TableColumn("URL");
        urlColumn.setMinWidth(50);
        urlColumn.setCellValueFactory(
                new PropertyValueFactory<EarthquakeData, String>("url"));
        
    }

    public TableColumn getLocationColumn() {
        return locationColumn;
    }

    public TableColumn getMagnitudeColumn() {
        return magnitudeColumn;
    }

    public TableColumn getDateAndTimeColumn() {
        return quakeTimeColumn;
    }

    public TableColumn getLatitudeColumn() {
        return latitudeColumn;
    }

    public TableColumn getLongitudeColumn() {
        return longitudeColumn;
    }
    
    public TableColumn getDepthColumn() {
        return depthColumn;
    }

    public TableColumn getUrlColumn() {
        return urlColumn;
    }
}
