public class investmentCalc {
/*
Concepts covered: data types, variables, methods and operators.
Problem Statement: Consider an investment app like Groww or Zerodha. There is a requirement to add a feature in the
application where the user can enter the following inputs to create a new investment:
1. Their lump sum investment amount for a mutual fund (MF)
2. Tenure of investment
3. And interest rate for returns (Average return of MF is 16%).
According to the amount, time, and interest rate the user can see the matured amount (on a compounding basis or by
calculating the compound interest) of their investment after the given time period.
Modify the given Java code to enable this feature. 
 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the lump sum investment amount: ");
    double principal = sc.nextDouble();
    System.out.print("Enter the tenure of investment (in years): ");
    int time = sc.nextInt();
    System.out.print("Enter the interest rate (in percentage): ");
    double rate = sc.nextDouble();
    double maturityAmount = calculateMaturityAmount(principal, time, rate);
    System.out.printf("Matured amount (on a compounding basis) after %d years: %.2f", time, maturityAmount);
    }
    // Add new method to calculate the maturity amount
    
}
