package com.codedifferently.lab.calc4;

public class Calculator4 {
    public double tax = .05;
    public double tip = .15;

    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public double findTotal(double price,String name){
        double total =  price + ( tax * price ) + (tip * price) ;
         System.out.print(total + "\n");
       return total;
    }
}
