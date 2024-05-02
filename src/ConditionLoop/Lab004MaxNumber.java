package ConditionLoop;

import java.util.Scanner;

public class Lab004MaxNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num>20){
            System.out.println("Number is greater than 20");
        } else if (num>10) {
            System.out.println("Number is between 10 and 20");

        }
        else
        {
            System.out.println("Number <20");
        }
        sc.close();
    }
}
