package Array;

public class Lab0015_2DArrary {
    public static void main(String[] args) {
        int [][]arr_2d={{1,2,3},{4,5,6},{7,8,9}};
        //int[][]arr2d=new int[3][3];
        //arr2d[0][0]=1;
        //arr2d[0][1]=2;
        for (int i=0;i<arr_2d.length;i++)
        {
            for (int j=0;j<arr_2d[i].length;j++)
            {
                System.out.println(arr_2d[i][j]);
            }
        }
    }
}
