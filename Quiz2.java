import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the side of the hexagon:");
        int s= input.nextInt();

        double pi= 3.142;
        double area= (6 * Math.pow(s,2))/(4* Math.tan(pi/6));
        System.out.println(area);


        input.close();



        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = input1.nextLine();
        for (char i = 0;i < a.length()+1;i--){
            System.out.println(a);
        }
input1.close();

    }
}

