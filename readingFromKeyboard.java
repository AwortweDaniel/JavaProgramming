import java.util.Scanner;

public class readingFromKeyboard {
    public static void main(String[] args) {
        //create the scanner variable
        Scanner input = new Scanner(System.in);

        //create a variable to store user name
        String userName;

        //ask a user to enter his/her name
        System.out.println("Please enter your name: ");

        //read user input
        userName = input.nextLine();

        System.out.println("please enter your age:");
        int age = input.nextInt();

        //display the welcome message
        System.out.println(userName + ", welcome to java");

        //close scanner variable
        input.close();
    }
}
