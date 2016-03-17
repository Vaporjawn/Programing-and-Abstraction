/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author todoslosdays
 */import java.util.Scanner;

public class ChangeMaker {public static void main(String[] args){;

Scanner keyboard = new Scanner(System.in);

{
System.out.println("Welcome to the Dollar Store");
System.out.println(" ");
System.out.println("Please submit the price of your item and the amount you are paying for it");
System.out.println(" ");
System.out.println("Please do not acceed 100 cents");
System.out.println(" ");
int Price,Amount;

 Price = keyboard.nextInt();
Amount = keyboard.nextInt();
System.out.println("Thank you! Your change is ");
System.out.println(Amount - Price);

    int Change, quarters, dimes, nickels, pennies;
    Change = (Amount - Price);
    quarters = Change / 25;
    Change = Change % 25;
    dimes = Change / 10;
    Change = Change % 10;
    nickels = Change / 5;
    Change = Change % 5;
    pennies = Change / 1;
    
    
    
System.out.println(quarters + " quarters");
System.out.println(dimes + " dimes");
System.out.println(nickels + " nickels");
System.out.println(pennies + " pennies");

System.out.println("Please come again!");
}
}}