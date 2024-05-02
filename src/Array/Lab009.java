package Array;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float[]Marks=new float[5];
        System.out.println("Enter the first Sub 1 Marks");
        Marks [0]=sc.nextFloat();
        System.out.println("Enter the first Sub 2 Marks");
        Marks [1]=sc.nextFloat();
        System.out.println("Enter the first Sub 3 Marks");
        Marks [2]=sc.nextFloat();
        System.out.println("Enter the first Sub 4 Marks");
        Marks [3]=sc.nextFloat();
        System.out.println("Enter the first Sub 5 Marks");
        Marks [4]=sc.nextFloat();
        for (int i=0;i<Marks.length;i++)
        {
            if (Marks[i]<30)
            {
                System.out.println("Falied in this subject"+Marks[i]);
            }
            System.out.println(Marks[i]);
            int j=0;
            while (j<Marks.length)
            {
                System.out.println(Marks[j]);
                j++;
            }
        }
        sc.close();

    }
}
