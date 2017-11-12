/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Nov 12, 2017 6:12:03 PM
 * 
 */
package cais220project;

import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 *
 * @author lizhayes-golding
 */
public class DataSelectorPane extends Pane {

    VBox vbox = new VBox();
    BorderPane borderPane = new BorderPane();

    public DataSelectorPane() {
        Label title = new Label("Show:");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        CheckBox chkLocation = new CheckBox("Location");
        CheckBox chkDateAndTime = new CheckBox("Date and Time");
        CheckBox chkLatitude = new CheckBox("Latitude");
        CheckBox chkLongitude = new CheckBox("Longitude");
        CheckBox chkDepth = new CheckBox("Depth");

        vbox.getChildren().addAll(chkLocation, chkDateAndTime, chkLatitude,
                chkLongitude, chkDepth);
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(5);
        vbox.setPrefSize(400, 200);

        borderPane.setStyle("-fx-background-color: gainsboro; -fx-border-color: gray");
        borderPane.setTop(title);
        borderPane.setCenter(vbox);
        borderPane.setPadding(new Insets(5, 5, 5, 30));

        getChildren().add(borderPane);
    }

}

