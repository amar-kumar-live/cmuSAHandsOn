import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
    
        double a, b, c, discriminant, root1, root2, root;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        c = input.nextDouble();
        
        // Calculating the discriminant
        discriminant = b*b - 4 * a * c;
        
        // Checking the value of the discriminant and finding the roots of the quadratic equation
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            System.out.println("The equation has no real root");
        }
        
    }
}
