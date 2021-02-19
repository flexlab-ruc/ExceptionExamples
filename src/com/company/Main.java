package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("your age please");
        try
        {
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("you are " + age + " years old"  );
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong?");
            System.out.println("We only allow numbers");
            int age = Integer.parseInt(scanner.nextLine());

        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("your age please");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("you are " + age + " years old"  );




    }
}
