package Array.homework;

public class Lab003_Max_Salary {
    public static void main(String[] args) {
        int [] salary={40,63,21,45,70};
        int max=0;
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]>max)
            {
                int n=salary[i];
                max=n;
            }
        }
        System.out.println(max);
    }
}
