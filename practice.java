import java.util.Scanner;

public class practice {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //System.out.println("Please enter the number of days to be converted into minutes:");
        //int enteredDays = input.nextInt();
        //int minutes = enteredDays * 24 * 60;
        //System.out.println(enteredDays+"Days equals "+ minutes+"mins");

        //System.out.println("please enter distance in m");
        //double distance = input.nextDouble();

        //System.out.println("please enter time in s");
        //double time = input.nextDouble();
        //double speed = distance/time;
        //System.out.printf("Speed: %.2f m/s", speed);



        boolean is_convert = true;
        while (is_convert){
            System.out.println("Enter the amount of dollar to be converted: ");
            double dollar = input.nextDouble();
            double euro = Math.round((dollar * 0.88)*100);
            System.out.println(euro/100.0 + "Euros");
        }
        input.close();
        //double a = Math.round(((2.0/6)*100))/ 100.0;
        //System.out.println(a);

        //System.out.println(Math.ceil(4.53));
        //System.out.println(Math.ceil(3.1));
        //System.out.println(Math.rint(4.53));
        //System.out.println(Math.rint(3.1));
        //System.out.println(Math.floor(4.53));
        //System.out.println(Math.floor(3.1));
        //System.out.println(Math.round(4.53));
        //System.out.println(Math.round(3.1));

        //String name = "Daniel";
        //String name3 = "Danie";
        //System.out.println( name. contains(name3));
    }
}
