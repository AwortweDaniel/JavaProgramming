
public class MathFunctions {
    public static void main(String[] args) {
        //CONSTANTS IN JAVA pi E
        System.out.println("Constants in Java");
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(2* Math.PI);
        System.out.println("===========================");

        //TRIG FUNCTIONS IN JAVA
        System.out.println("Trig Function");
        System.out.println(Math.cos(90));//Not Right but you should first do conversion from radian to degrees

        System.out.println("===========================");
        //CONVERT FROM DEGREES TO RADIANS
        System.out.println(Math.cos(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.tan(Math.toRadians(90)));

        //ASSIGNMENT asin, acos, atan

        System.out.println("===========================");
        //EXPONENT FUNCTIONS
        System.out.println("Exponent Functions");
        System.out.println(Math.exp(5));
        System.out.println(Math.log(15));// natural log of 15
        System.out.println(Math.log10(15));// log base 10 of 15
        System.out.println(Math.pow(5, 7));// 5 to power 7
        System.out.println(Math.sqrt(25));//square root of 25
        System.out.println(Math.pow(25, (1.0/7)));//25 to power 1/7

        System.out.println("===========================");
        //ROUNDING OFF NUMBERS
        System.out.println("ROUNDING OFF NUMBERS");
        System.out.println("ceil:" + Math.ceil(89.7952));
        System.out.println("ceil:" + Math.ceil(89.1952));
        System.out.println("floor:" + Math.floor(89.7952));
        System.out.println("floor:" + Math.floor(89.1952));
        System.out.println("rint:" + Math.rint(89.7952));
        System.out.println("rint:" + Math.rint(89.1952));
        System.out.println("round:" + Math.round(89.7952));
        System.out.println("round:" + Math.round(89.1952));

        double x = 1.0/3;
        //System.out.printf("%.3f",x);
        double x1 = Math.round(x * 100);
        System.out.println(x1/100.0);
        System.out.println("=============================");

        //MAX, MIN, ABSOLUTE FUNCTIONS

        System.out.println(Math.max(1.34, -12));
        System.out.println(Math.min(1.34, -12));
        System.out.println(Math.abs( -12));

        System.out.println("=============================");
        //RANDOM NUMBER GENERATOR


    }
}
