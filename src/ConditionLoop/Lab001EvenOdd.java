package ConditionLoop;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Lab001EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num=sc.nextInt();
        if(num%2==0) {
            System.out.println("Even");
        }
            else
            {
                System.out.println("Odd");
            }
            sc.close();
        }
    }

