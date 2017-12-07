/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Nov 12, 2017 6:12:35 PM
 * 
 */
package cais220project;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author lizhayes-golding
 */
public class TimeSelectorPane extends Pane {

    VBox vbox = new VBox();
    BorderPane borderPane = new BorderPane();
    RadioButton rbHour = new RadioButton("Past Hour");
    RadioButton rbDay = new RadioButton("Past Day");
    RadioButton rb7Days = new RadioButton("Past 7 Days");
    RadioButton rb30Days = new RadioButton("Past 30 Days");
    
    public TimeSelectorPane() {
        Label title = new Label("Show earthquakes in:");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        rbHour.setSelected(true);

        ToggleGroup group = new ToggleGroup();
        rbHour.setToggleGroup(group);
        rbDay.setToggleGroup(group);
        rb7Days.setToggleGroup(group);
        rb30Days.setToggleGroup(group);

        vbox.getChildren().addAll(rbHour, rbDay, rb7Days, rb30Days);
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(5);
        vbox.setPrefSize(400, 250);
        
        borderPane.setStyle("-fx-background-color: gainsboro; -fx-border-color: gray");
        borderPane.setTop(title);
        borderPane.setCenter(vbox);
        borderPane.setPadding(new Insets(5, 5, 5, 30));
        getChildren().add(borderPane);
    }

    public boolean hourSelected() {
        return rbHour.isSelected();
    }
    
    public boolean daySelected() {
        return rbDay.isSelected();
    }
    
    public boolean weekSelected() {
        return rb7Days.isSelected();
    }
    
    public boolean monthSelected() {
        return rb30Days.isSelected();
    }
    
}
