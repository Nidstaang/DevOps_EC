package com.company;
import java.util.*;
import java.util.Scanner;

    class Uppgift3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x;
            do{
                try{
                    System.out.print("Input a number > 0: \n");
                    x = sc.nextInt();
                    System.out.println("The number is: " + x);
                }catch(InputMismatchException e){
                    sc.nextLine();
                    x = 0;
                    System.out.println("Please write an integer ");
                }
            }while(x<=0);
        }
    }
