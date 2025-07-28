public class methodsPract2 {


    public static void main(String[] args) {
        int A=25;
        int B=20;

        //calling add method
       int result= add(A,B);
        System.out.println(result);
        //Calling mult method
        int mult = mult(2, 5, 8);
        System.out.println(mult);

    }


    //Creating method mult for multiplying numbers
    private static int mult(int x, int y,int z){
        return x * y * z;
    }



    //Creating method for adding numbers
    private static int add(int x, int y) {
        int result = x+ y;
        return result;
    }
}
