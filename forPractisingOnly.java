import java.util.Scanner;

public class forPractisingOnly {
    public static void main(String[] args) {
        System.out.println(Math.log(45));
        System.out.println(Math.floor(Math.sqrt(29)));
        System.out.println(Math.floor(Math.pow(5, 65) / 100) *100);


        double x = 2.0/6;
        double x1 = Math.round(x * 100);
        System.out.println(x1/100.0);

        System.out.println((int)(Math.random()* (10)));

        System.out.println("John said, \'I'm a good boy\'");

        String one = "a";
        String two = "Q";
        System.out.println(one.equalsIgnoreCase(two));

        if(one.equals(two)){
            System.out.println("They are not the same because of their case");
        } else if (one.equalsIgnoreCase(two)) {
            System.out.println("They are the same irrespective of their case");

        } else{
            System.out.println("Not the same at all");
        }

        System.out.println("\nStudent should please enter their cwa:");
        Scanner input = new Scanner(System.in);
        double cwa = input.nextDouble();

            if ((cwa <= 100) && (cwa > 80)) {
                System.out.println("Student is a first class student");
            } else if (cwa < 50) {
                System.out.println("Student doesn't fit to be in umat");

            } else {
                System.out.println("Student still has a chance to pull up first class");
            }
            input.close();
        }

    }

