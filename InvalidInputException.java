/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lx05;

/**
 *
 * @author SamsungX
 */
public class InvalidInputException extends Exception {
    public InvalidInputException(double input) {
        super(input + " is not a valid input!");
    }
}
