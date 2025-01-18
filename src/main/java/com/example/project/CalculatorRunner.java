package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {


        //test your program here
        //1. create an instance of the calculator class
        Calculator cal = new Calculator("Cal1");


        //2. call any methods of that class to test
        double operation = cal.performOperation("+", 5,6);
        System.out.println(operation);
       
        boolean trueFalse= cal.divisibleBy(5, 6);
        System.out.println(trueFalse);


        String coords = cal.coordinatePair(5, 6);
        System.out.println(coords);
       
        int absValue = cal.absoluteValue(5, 6);
        System.out.println(absValue);
       
        String information = cal.info();


       
    }
}

