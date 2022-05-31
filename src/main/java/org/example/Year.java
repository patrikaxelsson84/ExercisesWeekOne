package org.example;

import java.util.Scanner;
public class Year {
    public void year(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = input.nextInt();
        if((year%400==0) || ((year%4==0) && (year%100!=0))){
            System.out.println(year+" is a Leap Year.");
        }
        else {
            System.out.println(year+" is not a Leap Year.");
        }
    }
}
