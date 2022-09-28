package dk.javahandson.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class MainController {

    @FXML
    private Label lbl;

    @FXML
    private void clickBtn(ActionEvent actionEvent) {
        //Action button
        lbl.setText("Its alive fk yeah");
    }


}
