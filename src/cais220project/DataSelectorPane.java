/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Nov 12, 2017 6:12:03 PM
 * 
 */
package cais220project;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author lizhayes-golding
 */
public class DataSelectorPane extends Pane {

    private VBox vbox = new VBox();
    private BorderPane borderPane = new BorderPane();
    private CheckBox chkLocation = new CheckBox("Location");
    private CheckBox chkMagnitude = new CheckBox("Magnitude");
    private CheckBox chkDateAndTime = new CheckBox("Date and Time");
    private CheckBox chkLatitude = new CheckBox("Latitude");
    private CheckBox chkLongitude = new CheckBox("Longitude");
    private CheckBox chkDepth = new CheckBox("Depth");
    private CheckBox chkUrl = new CheckBox("URL");

    public DataSelectorPane() {
        Label title = new Label("Show:");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 20)); 
        Text txtDirections = new Text("Uncheck boxes to remove columns from the table.");
       
        vbox.getChildren().addAll(chkLocation, chkMagnitude, chkDateAndTime, chkLatitude,
                chkLongitude, chkDepth, chkUrl, txtDirections);
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(5);
        vbox.setPrefSize(400, 250);

        chkLocation.setSelected(true);
        chkMagnitude.setSelected(true);
        chkDateAndTime.setSelected(true);
        chkLatitude.setSelected(true);
        chkLongitude.setSelected(true);
        chkDepth.setSelected(true);
        chkUrl.setSelected(true);
        
        borderPane.setStyle("-fx-background-color: gainsboro; -fx-border-color: gray");
        borderPane.setTop(title);
        borderPane.setCenter(vbox);
        borderPane.setPadding(new Insets(5, 5, 5, 30));

        getChildren().add(borderPane);
    }
    
    public boolean locationSelected() {
        return chkLocation.isSelected();
    }
    
    public boolean magnitudeSelected() {
        return chkMagnitude.isSelected();
    }
    
    public boolean dateAndTimeSelected() {
        return chkDateAndTime.isSelected();
    }
    
    public boolean latitudeSelected() {
        return chkLatitude.isSelected();
    }

    public boolean longitudeSelected() {
        return chkLongitude.isSelected();
    }
    
    public boolean depthSelected() {
        return chkDepth.isSelected();
    }
    
    public boolean urlSelected() {
        return chkUrl.isSelected();
    }
}

