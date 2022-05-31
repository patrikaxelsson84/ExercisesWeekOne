package org.example;

import java.util.Scanner;

public class InputName {
    public void inputName(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name=scan.nextLine();
        System.out.println("Hello "+name);

    }
}
