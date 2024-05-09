package Array;

public class Lab0012_MaxSalary {
    public static void main(String[] args) {
        int[] salaries = {30, 40, 58, 66, 88, 77, 67, 99, 100};
        int max_salary = Integer.MIN_VALUE;
        for (int i=0;i<salaries.length;i++)
        {
            if (salaries[i]>max_salary){
                max_salary=salaries[i];
            }
        }
        System.out.println("Max Salary->"+max_salary);
    }
}
