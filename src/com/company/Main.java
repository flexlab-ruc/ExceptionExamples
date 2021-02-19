package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ColorArrayExercise colorList = new ColorArrayExercise();

        try{
            colorList.addColor("red", 3);
            colorList.addColor("blue",1 );
            colorList.addColor("blue",2 );
            colorList.addColor("blue",3 );
            colorList.addColor("blue",4 );
            colorList.addColor("blue",0 );

        }
        catch (Exception e)
        {
            System.out.println("problems to be solved....");
            System.out.println(e);
        }

        try{
            colorList.printList();
        }
        catch (Exception e)
        {
            //System.out.println("problems to be solved....");
            //System.out.println(e);
            
            // let main fix the issue!"
            // fix all no colors becomes black!?
            for (int i = 0; i < colorList.colors.length; i++) {
                if (colorList.colors[i] == null) colorList.colors[i] = "black";
            }
            try {
                colorList.printList();
            }
            catch (Exception ee)
            {
                System.out.println("wrong anyway?");
            }

        }

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

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("your age please");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("you are " + age + " years old"  );
        */



    }
}
