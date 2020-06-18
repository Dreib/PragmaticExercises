package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class SayingHello {

    public static String name;

    public static void main( String[] args )
    {
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        name = scanner.next();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
