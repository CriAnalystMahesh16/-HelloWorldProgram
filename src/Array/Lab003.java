package Array;

public class Lab003 {
    public static void main(String[] args) {
        int []a =new int[4];
        //Default value of a is 0.
        //Exception is something which stops the program
        //Here a[5]=90, it will give error that arrary out of bound.
        a[3]=90;
        System.out.println(a[3]);

    }
}
