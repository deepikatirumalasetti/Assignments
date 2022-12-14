package com.company;
import java.util.Scanner;
class SimpleComp {

    public static void main(String[] args) {

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // take input from users
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter the time: ");
        double time = input.nextDouble();

        System.out.print("Enter number of times interest is compounded: ");
        int number = input.nextInt(); //declare number for compound interest only

        double interest = (principal * time * rate) / 100; //simple interest

        interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal; //compound interest

        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("Compound Interest: " + interest);

        input.close();
    }
}

