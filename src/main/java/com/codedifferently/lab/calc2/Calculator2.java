package com.codedifferently.lab.calc2;

public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;

    public void findTotal(){
        //Calculate an individual's total after tax and tip
        double amount1 = originalPrice * tip;
        double amount2 =  originalPrice * tax;
        double total = originalPrice + amount1 + amount2;
        //Print this value
        System.out.println("total amount after tax and tip: " + total);
    }
}
