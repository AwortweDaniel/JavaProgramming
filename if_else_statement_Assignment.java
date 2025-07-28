import java.util.Scanner;

public class if_else_statement_Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year of birth: ");
        int YoB = input.nextInt();

        if (YoB % 12 == 0) {
            System.out.println("Year of Monkey");
        } else if (YoB % 12 == 1) {
            System.out.println("Year of Rooster");
        } else if (YoB % 12 == 2) {
            System.out.println("Year of Dog");
        } else if (YoB % 12 == 3) {
            System.out.println("Year of Pig");
        } else if (YoB % 12 == 4) {
            System.out.println("Year of Rat");
        } else if (YoB % 12 == 5) {
            System.out.println("Year of Ox");
        } else if (YoB % 12 == 6) {
            System.out.println("Year of Tiger");
        } else if (YoB % 12 == 7) {
            System.out.println("Year of Rabbit");
        } else if (YoB % 12 == 8) {
            System.out.println("Year of Dragon");
        } else if (YoB % 12 == 9) {
            System.out.println("Year of Snake");
        } else if (YoB % 12 == 10) {
            System.out.println("Year of Horse");
        } else {
            System.out.println("Year of Sheep");
        }
        input.close();
    }


}
