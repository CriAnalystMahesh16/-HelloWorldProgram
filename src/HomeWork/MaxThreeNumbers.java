package HomeWork;

public class MaxThreeNumbers {
    public static void main(String[] args) {
       int a=10;
       int b=20;
       int c=30;
       int maxNumber = (a>b)? (a>b?a:c):(b>c?a:c);
       System.out.println("Maximum number from three numbers is:"+maxNumber);
    }
}

