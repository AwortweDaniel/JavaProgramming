import java.util.Scanner;

public class Selections {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter an integer:");

        //int number = input.nextInt();
        //if(number > 0){
        //    if(number % 2 == 0){
        //        System.out.println(number + " is an even number");
        //    }else {
        //        System.out.println(number + " is an odd number");
        //    }
        //}else{
        //    System.out.println(number+ " is a negative integer");
        //}

        //System.out.println("\n================================");
        System.out.println("Enter student mark: " );
        double mark = input.nextDouble();



        if (mark >= 80.0) {
            System.out.println(mark + "is a first class");

        } else if ((mark >= 70.0) &&(mark < 80)) {
            System.out.println(mark + "is a second class");
        }
        input.close();
    }
}
