package ConditionLoop.Homework2;

import ex_11042024.Main;

import java.util.Scanner;

public class Largest_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1=sc.nextInt();
        System.out.println("Enter the number 2");
        int num2=sc.nextInt();
        System.out.println("Enter the number 3");
        int num3=sc.nextInt();
        if ((num1>num2)&&(num1>num3))
        {
            System.out.println("Number 1 is the largest");
        } else if ((num2>num1)&&(num2>num3)) {
            System.out.println("Number 2 is largest");
        }else
        {
            System.out.println("Number 3 is largest");
        }

    }
}
