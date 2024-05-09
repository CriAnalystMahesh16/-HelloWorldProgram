package Array;

public class Lab0013_MaxSalart_WhileLoop {
    public static void main(String[] args) {
        int[] salaries = {30, 40, 58, 66, 88, 77, 67, 99, 100};
        int max_salary = Integer.MIN_VALUE;
        int j=0;
        while (j<salaries.length){
            if (salaries[j]>max_salary){
                max_salary=salaries[j];
            }
            j++;
        }
        System.out.println("Max Sal->"+max_salary);
    }
}
