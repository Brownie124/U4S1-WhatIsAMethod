package com.codedifferently.lab.calc4;

public class CalculatorTest4 {
    public static void main(String[] args) {

        Calculator4 calc = new Calculator4();

        //Name your friends//
       double person1 = calc.findTotal(10, null);
        double person2 = calc.findTotal(12, null);
        double person3 =  calc.findTotal(9,  null);
        double person4 = calc.findTotal(8,  null);
        double person5 = calc.findTotal(7,  null);
        double alex = calc.findTotal(15, "Alex");
        double person7 = calc.findTotal(11, null);
        double forgettotal = calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
        double sharecost = (alex + forgettotal) /6;
        double totaltable = person1 + person2 + person3 + person4 + person5 + person7 + sharecost;
        System.out.println("this is the total" + totaltable);
    }
}
