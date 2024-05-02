package Array;

public class Lab002 {
    public static void main(String[] args) {
        int [] ages={1,2,3,4,5};//Fixed values are there

        //Reassign the values here we are using in webautomation

        int[]ages2=new int[5];

        //Default value for arrary is 0-for non primitive data types have their own default value

        System.out.println(ages2[0]);
        System.out.println(ages2[4]);
        ages2[0]=11;
        System.out.println(ages2[0]);

        String[] breakfast_items={"milk","tea","dosa","misal","Upama","Rava","Juice"};
        System.out.println(breakfast_items.length);





    }
}
