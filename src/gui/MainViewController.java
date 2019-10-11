/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.util.Alerts;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.jdbc.Main;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author yuri.miyazaki
 */
public class MainViewController implements Initializable {

    @FXML
    private MenuItem menuItemRegistrationSeller;

    @FXML
    private MenuItem menuItemRegistrationDepartment;

    @FXML
    private MenuItem menuItemHelpAbout;

    @FXML
    private void onMenuRegistrationItemSeller_Action() {
        System.out.println("onMenuRegistrationItemSeller_Action");
    }

    @FXML
    private void onMenuItemRegistrationDepartment_Action() {
        loadView("/gui/DepartmentList.fxml");
    }

    @FXML
    private void onMenuItemHelpnAbount_Action() {
        loadView("/gui/About.fxml");
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {
    }

    private void loadView(String absoluteName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = loader.load();

            Scene mainScene = Main.getMainScene();
            VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVbox.getChildren().get(0);
            mainVbox.getChildren().clear();
            mainVbox.getChildren().add(mainMenu);
            mainVbox.getChildren().addAll(newVBox.getChildren());
        } catch (IOException e) {
            Alerts.showAlert("IO Exception", "error load view", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

}
