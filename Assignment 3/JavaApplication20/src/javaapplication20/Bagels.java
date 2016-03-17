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

import java.util.Random;
import javax.swing.JOptionPane;

public class Bagels {
    
    private String secretNumber; 
    private String userGuess; 
    private int secretNumber1, secretNumber2, secretNumber3;
    private int userGuess1, userGuess2, userGuess3;
    private int guessCount;

    public void playGame() 
    {
        generateSecretNumber();
        
        do {
            userGuess = JOptionPane.showInputDialog("Enter a three digit number");
            System.out.println("Your guess is " + userGuess);
            printHint(userGuess);
            System.out.println();
            
        }
        while (!userGuess.equals(secretNumber));                   

     }

    private void generateSecretNumber()
    {
             Random rnd = new Random();

        secretNumber1 = rnd.nextInt(9) + 1;
        secretNumber2 = rnd.nextInt(10);
        secretNumber3 = rnd.nextInt(10);
        
        while(secretNumber1 == secretNumber2){
            secretNumber2 = rnd.nextInt(10);
        }
        while(secretNumber1 == secretNumber3|| secretNumber2 == secretNumber3){
            secretNumber3 = rnd.nextInt(10);
        }
        
        secretNumber = secretNumber1 + "" + secretNumber2 + secretNumber3;
    }    

    private void printHint(String guess)        
    {
       if(secretNumber.equals(guess)){
            System.out.println("Correct");
       }
          else
             {
             userGuess1 = userGuess.charAt(0) - 48;
             userGuess2 = userGuess.charAt(1) - 48;
             userGuess3 = userGuess.charAt(2) - 48;
             }

        if(userGuess1 == secretNumber1)
        {
            System.out.print("Fermi ");
        }
        if(userGuess2 == secretNumber2)
        {
            System.out.print("Fermi ");
        }
        if(userGuess3 == secretNumber3)
        {
            System.out.print("Fermi ");
        }
        if(userGuess2 == secretNumber1 || userGuess3 == secretNumber1)
        {
            System.out.print("Pico ");
        }
        if(userGuess1 == secretNumber2 || userGuess3 == secretNumber2)
        {
            System.out.print("Pico ");
        }
        if(userGuess1 == secretNumber3 || userGuess2 == secretNumber3)
        {
            System.out.print("Pico ");
        }
        else if(userGuess1 != secretNumber1 && userGuess1 != secretNumber2 && userGuess1 != secretNumber3 &&
                userGuess2 != secretNumber1 && userGuess2 != secretNumber2 && userGuess2 != secretNumber3 &&
                userGuess3 != secretNumber1 && userGuess3 != secretNumber2 && userGuess3 != secretNumber3)
        {
            System.out.print("Bagels");
        }
        guessCount++;
    }
}
