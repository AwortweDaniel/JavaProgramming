import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year of birth: ");
         int YoB = input.nextInt();
         switch (YoB%12){
             case 0:
                 System.out.println("Year of Monkey");
                 break;

             case 1:
                 System.out.println("Year of Rooster");
                 break;
             case 2:
                 System.out.println("Year of Dog");
                 break;
             case 3:
                 System.out.println("Year of Pig");
                 break;
             case 4:
                 System.out.println("Year of Rat");
                 break;
             case 5:
                 System.out.println("Year of Ox");
                 break;
             case 6:
                 System.out.println("Year of Tiger");
                 break;
             case 7:
                 System.out.println("Year of Rabbit");
                 break;
             case 8:
                 System.out.println("Year of Dragon");
                 break;
             case 9:
                 System.out.println("Year of Snake");
                 break;
             case 10:
                 System.out.println("Year of Horse");
                 break;
             default:
                 System.out.println("Year of Sheep");
         }
         input.close();
    }
}
