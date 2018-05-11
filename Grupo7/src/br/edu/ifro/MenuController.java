/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 04014985229
 */
public class MenuController implements Initializable {
    
    @FXML
    private TextField txtnumero1, txtnumero2, txtresultado;
    
    @FXML
    private Button btnsoma;
    
    
    @FXML
    private void somar (ActionEvent event) {
     Double n1, n2 ,result;
        n1 = Double.parseDouble(txtnumero1.getText());
        n2 = Double.parseDouble(txtnumero2.getText());
        result = n1 + n2;
        txtresultado.setText(result.toString()); 
    
    }
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}