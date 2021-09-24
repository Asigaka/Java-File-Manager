package com.asigaka.java.filemanager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class ProgressController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label labelProgress;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Label nameFileLabel;

    @FXML
    void initialize(Label labelProgress, Label nameFileLabel) {

    }
}
