/* 
Concepts covered: loops & control structures
Problem Statement: Consider the previous use case of an investment application. The next task is to add a monthly
investment feature according to the below requirements:
● The user will be asked to enter the type of mutual fund they want to invest the money in. The 3 types of mutual
funds according to the return and their convenience of taking risks are as follows
a. Large Cap (14% p.a with low risk)
b. Midcap (19% p.a. With slightly risky)
c. Small Cap (24% p.a. With High Risk)
● It should ask the monthly SIP amount they want to invest in the selected mutual fund.
● Based on the inputs, the maturity amount for the MF is printed
● Then user should be prompted to input if they want to add another MF investment - “Do you want to invest in
another mutual fund? (Y/N)”. If the user responds with a yes (Y), they should be prompted to input the type and
monthly SIP for the new investment as well. This should continue until the user responds with a no (N)
● Based on the user’s investment plans the combined maturity amount for all MFs at the end of 5 years is printed.
Update the given code as necessary.
Given code:  
 */

 import java.util.Scanner;

 public class MutualFundInvestment {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double maturedAmount = 0;
         char choice;
         boolean addAnotherFund = true;
         
         while (addAnotherFund) {
             int fundType = getFundType(input);
             double monthlySIP = getMonthlySIP(input);
             double maturity = calculateMaturity(fundType, monthlySIP);
             maturedAmount += maturity;
             System.out.println("Do you want to invest in another mutual fund? (Y/N)");
             choice = input.next().charAt(0);
             if (choice == 'N' || choice == 'n') {
                 addAnotherFund = false;
             }
         }
         System.out.println("Total matured amount after 5 years: " + maturedAmount);
     }
 
     private static int getFundType(Scanner input) {
         int fundType;
         System.out.println("Enter the type of mutual fund you want to invest in:");
         System.out.println("1. Large Cap (14% p.a with low risk)");
         System.out.println("2. Mid cap (19% p.a. slightly risky)");
         System.out.println("3. Small Cap (24% p.a. With High Risk)");
         fundType = input.nextInt();
         return fundType;
     }
 
     private static double getMonthlySIP(Scanner input) {
         System.out.println("Enter the monthly SIP amount:");
         return input.nextDouble();
     }
     private static double calculateMaturity(int fundType, double monthlySIP) {
        double maturity = 0;
        double rateOfReturn = 0;
        int compoundingFrequency = 12; // Monthly compounding
        int investmentPeriod = 5 * 12; // 5 years investment period in months
        
        // Determine the rate of return based on the fund type
        if (fundType == 1) {
            rateOfReturn = 0.14 / compoundingFrequency; // Large Cap
        } else if (fundType == 2) {
            rateOfReturn = 0.19 / compoundingFrequency; // Midcap
        } else if (fundType == 3) {
            rateOfReturn = 0.24 / compoundingFrequency; // Small Cap
        }
        
        // Calculate the maturity amount using the formula
        maturity = monthlySIP * ((Math.pow(1 + rateOfReturn, investmentPeriod) - 1) / rateOfReturn) * (1 + rateOfReturn);
        
        System.out.println("Maturity amount after 5 years: " + maturity);
        return maturity;
    }
    
}