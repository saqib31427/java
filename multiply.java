import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: "); 
        int b = scanner.nextInt();
        int product = a * b;    
        System.out.println("The product of " + a + " and " + b + " is: " + product);
   

    }

}