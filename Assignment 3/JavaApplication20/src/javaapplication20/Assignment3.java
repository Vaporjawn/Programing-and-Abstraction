/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author todoslosdays
 */
import javax.swing.JOptionPane;

public class Assignment3 {

    public static void main(String[] args) {
        int playagain = JOptionPane.showConfirmDialog(null, "Would you like to play Fermi Pico Bagels?", "Message", JOptionPane.YES_NO_OPTION);

        while (playagain == JOptionPane.YES_OPTION) {      

         Bagels myBagels = new Bagels();
         
         myBagels.playGame();     
         
         playagain = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Message", JOptionPane.YES_NO_OPTION);
        }
    }
}   
