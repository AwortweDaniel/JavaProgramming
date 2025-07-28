import java.util.Scanner;

public class assignmentTriangleAreaCalculation {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the base of the triangle :");
    int enteredBase = input.nextInt();

    System.out.println("Enter the base of the triangle :");
    int enteredHeight = input.nextInt();
    double areaOfTriangle = 0.5 *( enteredBase * enteredHeight);

    System.out.println("The area of the triangle is: "+ areaOfTriangle+"square units");

    input.close();
    }
}
