/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ManagementController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML 
    private Label addmember_button;
    @FXML 
    private void memberAction(ActionEvent event) throws IOException{
    Parent parent = FXMLLoader.load(getClass().getResource("/Management/addmembers.fxml"));
    Stage stage = new Stage();
    Scene scene = new Scene(parent);
    stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
