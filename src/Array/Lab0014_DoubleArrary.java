package Array;

public class Lab0014_DoubleArrary {
    public static void main(String[] args) {
        int arr[]={3,4,5};
        int arr2[]=new int[3];
        for(int i=0;i<arr.length;i++)
        {
            arr2[i]=arr[i]*2;

        }
        System.out.println("Printing Arrays!!");
        for (int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }

    }
}
