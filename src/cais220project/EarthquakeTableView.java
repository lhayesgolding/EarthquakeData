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

  public EarthquakeTableView() {
    setColumns();
  }

  public EarthquakeTableView(ObservableList<EarthquakeData> items) {
    super(items);
    setColumns();
  }
  
  private void setColumns() {
    TableColumn locationColumn = new TableColumn("Location");
    locationColumn.setMinWidth(50);
    locationColumn.setCellValueFactory(
      new PropertyValueFactory<EarthquakeData, String>("location"));

    TableColumn magnitudeColumn = new TableColumn("Magnitude");
    magnitudeColumn.setMinWidth(10);
    magnitudeColumn.setCellValueFactory(
      new PropertyValueFactory<EarthquakeData, Double>("magnitude"));
    
    TableColumn quakeTimeColumn = new TableColumn("Earthquake time");
    quakeTimeColumn.setMinWidth(20);
    //quakeTimeColumn.setCellValueFactory(
    //  new PropertyValueFactory<EarthquakeData, String>("quakeTime"));
    quakeTimeColumn.setCellValueFactory(
            new Callback<TableColumn.CellDataFeatures<EarthquakeData, String>, ObservableValue<String>>() {
      @Override
      public ObservableValue<String> call(
              TableColumn.CellDataFeatures<EarthquakeData, String> param) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String quakeDate = dateFormat.format(
                param.getValue().getQuakeTime());
        return new SimpleStringProperty(quakeDate);
      }
    });
    
    
    this.getColumns().addAll(locationColumn, magnitudeColumn, quakeTimeColumn);
  }
 
}
