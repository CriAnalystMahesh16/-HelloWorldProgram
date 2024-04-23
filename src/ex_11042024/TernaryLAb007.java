package ex_11042024;

public class TernaryLAb007 {
    public static void main(String[] args) {
        boolean result=10>40? 10>40 :40>10;
        System.out.println(result);

        boolean result1=98>99? 98>98 :98<99;
        System.out.println(result1);
        System.out.println("--------------------------------------------");

        int a=true? 10:20;
        System.out.println(a);
        //if 30 is greater than 40,if ture print 10 else print 20;
        int a1=(30>40)? 10:20;
        System.out.println(a1);
        System.out.println("--------------------------------------------");
        String str=10>20?"10":"Twenty";
        System.out.println(str);


    }
}
