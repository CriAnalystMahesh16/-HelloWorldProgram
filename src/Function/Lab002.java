package Function;

public class Lab002 {
    public static void main(String[] args) {
        noRetrunNoParameter();
        NoReturnWithParamter("Hello");
        returnWithNoParameter(3,4);
      int result= sumofTwoNumbera(3,4 );
        System.out.println("result");
    }

    private static int sumofTwoNumbera(int i, int i1) {
        return 0;
    }

    static void returnWithParameter(int a , int b) {

    }

    static void returnWithNoParameter(int a, int b) {
        System.out.println(a+b);
    }

    static void NoReturnWithParamter(String name) {
         System.out.println(" NoReturnWithParamter");
    }

    static void noRetrunNoParameter() {
         System.out.println(" noRetrunNoParamete");
    }
}
