import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter time in seconds:");
        int enteredTime = input.nextInt();
        //int totalMinutes = enteredTime/60;
        //int totalSeconds = enteredTime % 60;
        //System.out.println("TimeEntered: " +totalMinutes+"Mins, "+totalSeconds+"Secs");


//assignment(1) convert the entered seconds to  display hours, minutes, seconds
        int totalHours = enteredTime/3600;
        int remainder = enteredTime - totalHours * 3600;
        int minutes = remainder /60;
        int seconds  = remainder % 60;
        System.out.println("Total Time Entered:"+totalHours+"hour(s),"+minutes+"minutes"+","+seconds+"seconds");

        input.close();
    }
}
