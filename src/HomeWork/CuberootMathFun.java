package HomeWork;

public class CuberootMathFun {
    public static void main(String[] args) {
        double x=10;
        double y=12.4;
        double z=56.78;
        double result=Math.cbrt(Math.sqrt(x)+Math.sqrt(y)-Math.abs(z));
        System.out.println(result);

    }
}
