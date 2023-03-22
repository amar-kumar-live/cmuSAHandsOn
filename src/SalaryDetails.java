import java.util.Scanner;
public class SalaryDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of salaries:");
        int n = sc.nextInt();
        double[] salary = new double[n];
        System.out.println("Enter the salaries:");
        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextDouble();
        }
        
        double[] result = findDetails(salary);
        System.out.println("Average Salary : " + result[0]);
        System.out.println("Number of salaries greater than the average salary: " + result[1]);
        System.out.println("Number of salaries lesser than the average salary: " + result[2]);
    }
    
    public static double[] findDetails(double[] salary) {
        double[] details = new double[3];
        
        double sum = 0;
        for (double s : salary) {
            sum += s;
        }
        
        double average = sum / salary.length;
        
        int greater = 0;
        int lesser = 0;
        
        for (double s : salary) {
            if (s > average) {
                greater++;
            } else if (s < average) {
                lesser++;
            }
            
         }
         
         details[0] = average;
         details[1] = greater;
         details[2] = lesser;
         
         return details;   
    }
}