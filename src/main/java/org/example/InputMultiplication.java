package org.example;

import java.util.Scanner;

public class InputMultiplication {
    double num1;
    double num2;
    String sum1;
    public void inputmultiplication(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number here:");
        num1 = scan.nextInt();
        System.out.println("Enter second number here:");
        num2 = scan.nextInt();

        System.out.println(num1+"*"+num2+"="+(num1*num2));
        System.out.println(num1+"/"+num2+"="+(num1/num2));
        System.out.println(num1+"-"+num2+"="+(num1-num2));
    }
}
