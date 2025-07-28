import java.util.InputMismatchException;
import java.util.Scanner;

public class EuclideanAlgorithmProjectWork {
    public static void main(String[] args) {
       try{ System.out.println("Enter first number:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();


        System.out.println("Enter second number:");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        int result = gcd(num1, num2);

        System.out.println("The highest common divisor of " + num1 + " and " + num2 + " is: " + result);

           input.close();
           input2.close();
       }
        catch(InputMismatchException e){

            System.out.println("Enter a valid integer");
        }

    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
