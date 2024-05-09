package Function;

import java.util.Scanner;

public class Lab003_Calcaulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter num3");

        int r_sum = sum(num1, num2);
        int r_sub = sub(num1, num2);
      int r_mul = mul(num1, num2);
        System.out.println("sum is->" + r_sum);
        System.out.println("sub is->" + r_sub);
        System.out.println("mul is->" + r_mul);
    }

    static int mul(int a, int b) {
        return a*b;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;

    }



}