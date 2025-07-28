public class arithmeticOperation {
    public static void main(String[] args) {
        int num1 =20;
        int num2 = 30;
        double dec1 = 2.3;
        double dec2 = 3.5;

        //ADDITION
        System.out.println("int + int: " + (num1 + num2));
        System.out.println("Dec + Dec: " + (dec1 + dec2));
        System.out.println("Dec + int: " + (dec1 + num2));

        //SUBTRACTION
        System.out.println("int - int: " + (num1 - num2));
        System.out.println("Dec - Dec: " + (dec1 - dec2));
        System.out.println("Dec - int: " + (dec1 - num2));


        //MULTIPLICATION
        System.out.println("int * int: " + (num1 * num2));
        System.out.println("Dec * Dec: " + (dec1 * dec2));
        System.out.println("Dec * int: " + (dec1 * num2));

        //DIVISION
        System.out.println("int/int: " + (num1/num2));
        System.out.println("Dec/Dec: " + (dec1/dec2));
        System.out.println("Dec/int: " + (dec1/num2));

    }
}
