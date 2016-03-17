/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author todoslosdays
 */
public class Balloon {
    private int altitude;
    private String color;
    
    public void setColor(String balloonColor){
        
        color = balloonColor;
        
    }
        
    public String getColor(){
        
        return color;
    }
        
    public void increaseAltitude(int amount){
        
       altitude = amount;
        
    }
    
    public int getAltitude(){
        
        return altitude;
        
    }
    
    public boolean equals (String balloon1, String balloon2){
        
        if (color == color && altitude == altitude){
            
            System.out.println("The balloons are equal.");
            return true;
        }
        
        else{
            System.out.println("The balloons are not equal");
            return false;
        }
    }
    
    
}

class BalloonTester {
public static void main(String[] args) {
    
//Balloon balloon1 = new Balloon;
//Balloon balloon2 = new Balloon;

Balloon balloon1 = new Balloon();
Balloon balloon2 = new Balloon();

balloon1.setColor("Red");
balloon1.increaseAltitude(50);

balloon2.setColor("Blue");
balloon2.increaseAltitude(balloon1.getAltitude()*2);

balloon1.equals(balloon1);

if (balloon1.getColor().equals(balloon2.getColor()) && balloon1.getAltitude() == balloon2.getAltitude()){
    
    System.out.println("The balloons are equal");
    
}  
else {
    
    System.out.println("The balloons are not equal");
    
}
    

}}