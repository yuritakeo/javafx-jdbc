/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

/**
 *
 * @author yuri.miyazaki
 */
public class MainViewController implements Initializable{

    @FXML
    private MenuItem menuItemRegistrationSeller;

    @FXML
    private MenuItem menuItemRegistrationDepartment;
    
    @FXML
    private MenuItem menuItemHelpAbout;
    
    @FXML
    private void onMenuRegistrationItemSeller_Action(){
        System.out.println("onMenuRegistrationItemSeller_Action");
    }
    
    @FXML
    private void onMenuItemRegistrationDepartment_Action(){
        System.out.println("onMenuItemRegistrationDepartment_Action");
    }
    
    @FXML
    private void onMenuItemRegistrationAbount_Action(){
        System.out.println("onMenuItemRegistrationAbount_Action");
    }
    
    
    @Override
    public void initialize(URL uri, ResourceBundle rb) {
        
    }
    
}
