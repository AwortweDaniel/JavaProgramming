public class EqualityRelationalOperators {
    public static void main(String[] args) {
        int A = 20;
        int B = 31;

        System.out.println("Is "+ A + " equal to " + B + "? ");
        System.out.println(A == B);

        System.out.println("Is "+ A + " Not equal to " + B + "? ");
        System.out.println(A != B);

        System.out.println("Is "+ A + " less than " + B + "? ");
        System.out.println(A < B);

        System.out.println("Is "+ A + " less than or equal to " + B + "? ");
        System.out.println(A <= B);

        System.out.println("Is "+ A + " greater than " + B + "? ");
        System.out.println(A > B);

        System.out.println("Is "+ A + " greater than or equal to " + B + "? ");
        System.out.println(A >= B);

        //TERNARY OPERATOR ?
        int X = (A<B)? 40:80;
        System.out.println(X);
    }
}
