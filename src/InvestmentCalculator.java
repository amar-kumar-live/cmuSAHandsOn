import java.util.Scanner;
    public class InvestmentCalculator {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lump sum investment amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the tenure of investment (in years): ");
        int time = sc.nextInt();


    /*    System.out.print("Enter the interest rate for returns (leave blank for 16%): ");
        double rate;
        if (sc.hasNextDouble()) {
            rate = sc.nextDouble();
        } else {
            rate = 16.0;
        } */
        
        System.out.print("Enter the interest rate (in percentage): ");
        double rate = sc.nextDouble(); 

        double maturityAmount = calculateMaturityAmount(principal, time, rate);
        System.out.printf("Matured amount (on a compounding basis) after %d years: %.2f", time, maturityAmount);
        }
// Add new method to calculate the maturity amount

        private static double calculateMaturityAmount(double principal, int time, double rate) {
        
            return principal* Math.pow((1+ rate/100), time);
          //  return principal * Math.pow((1 + rate), time);
            
        }
}
