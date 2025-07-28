public class euclideanAlgorithm {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int result = gcd(num1, num2);

        System.out.println("The highest common divisor of " + num1 + " and " + num2 + " is: " + result);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


}
