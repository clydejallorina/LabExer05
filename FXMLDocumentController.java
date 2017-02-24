/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lx05;

import java.net.URL;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.text.DecimalFormat;

/**
 *
 * @author SamsungX
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private TextField input;
    @FXML private Label outputLabel;
    
    @FXML
    private void reset() {
        input.setText("");
        outputLabel.setText("");
    }
    
    @FXML
    private void convert() {
        try {
            double temp = Double.parseDouble(input.getText());
            if (temp < -273.15) {
                throw new InvalidInputException(temp);
            }
            else {
                outputLabel.setText(temp + " deg C = " + new DecimalFormat("#0.00").format((temp * 1.8) + 32) + " deg F");
            }
        }
        catch (InvalidInputException e) {
            outputLabel.setText(e.getMessage());
        }
        catch (NumberFormatException e) {
            outputLabel.setText("'" + input.getText() + "' is not a valid format!");
            System.out.println(e);
        }
        finally {
            input.setText("");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
