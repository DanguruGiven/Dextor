/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AdministratorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML 
    private Label generate;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
  void generatePassword(MouseEvent evt){
  
      System.out.println("Generate Password....");
  
  
  }    
}
