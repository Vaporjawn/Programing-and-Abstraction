/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Victor Williams
 * This program identifies triangles and calculates the area of the triangles
 * Due date: September 28, 2015
 * 
 */import java.util.Scanner;
import javax.swing.JOptionPane;
import static java.lang.Math.sqrt;
public class Assignment2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner (System.in);
        
        String sideAString = JOptionPane.showInputDialog("Please enter side A");
        double sideA = Double.parseDouble(sideAString);
        String sideBString = JOptionPane.showInputDialog("Please enter side B");
        double sideB = Double.parseDouble(sideBString);
        String sideCString = JOptionPane.showInputDialog("Please enter side C");
        double sideC = Double.parseDouble(sideCString);
    if (sideA + sideB >= sideC){
    if (sideA == sideB && sideB == sideC)
    {JOptionPane.showMessageDialog(null, "You have an equilateral trianlge");}
    
    if ((sideA * sideA) + (sideB * sideB) == (sideC * sideC))
    {JOptionPane.showMessageDialog(null, "You have a right triangle");}
    
    if ((sideA * sideA) + (sideB * sideB) < (sideC * sideC))
    {JOptionPane.showMessageDialog(null, "You have an obtuse triangle");}
    
    if ((sideA * sideA) + (sideB * sideB) > (sideC * sideC))
    {JOptionPane.showMessageDialog(null, "You have an acute triangle");}
    
    if (sideA == sideB || sideB == sideC || sideC == sideA)
    {JOptionPane.showMessageDialog(null, "You have an isosceles triange");}
    
    double trianglePerimiter = (sideA + sideB + sideC) / 2;
    double triangleArea = sqrt(trianglePerimiter * (trianglePerimiter - sideA) * (trianglePerimiter - sideB) * (trianglePerimiter - sideC));
    JOptionPane.showMessageDialog(null, "Your triangle area is " + triangleArea);}
    
    else JOptionPane.showMessageDialog(null, "That's not a triangle!");
}}
