public class Loops {
    public static void main(String[] args) {
        //while loop
        //execute codes while the condition is true
        int count = 1;
        while (count < 6){
            System.out.println(count * 2);
            count  +=1;
        }
        System.out.println("\nfirst 20 numbers divisible by both 3 and 7 ");
        //first 20 integers or numbers divisible by both 3 and 7
        int loopCon =1;
        int check = 0;
        while(loopCon < 1000){
            if ((loopCon %3 ==0)&&(loopCon%7 == 0)){
                System.out.println(loopCon);
                check ++;
                if (check ==20){
                    break;
                }
            }loopCon ++;
        }
    }
}
