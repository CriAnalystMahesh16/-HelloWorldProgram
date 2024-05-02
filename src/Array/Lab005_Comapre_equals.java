package Array;

public class Lab005_Comapre_equals {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        System.out.println(arr1);
        System.out.println(arr1);
        //here == check for content
        System.out.println(arr1==arr2);
        int[]arr3=arr1;
        System.out.println(arr1==arr3);
        System.out.println(arr1.equals(arr2));
        String s1="abcd";
        String s2="abcd";
        System.out.println(s1.equals(s2));//check contents


    }
}
