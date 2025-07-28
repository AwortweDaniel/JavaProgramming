import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws IOException {

        File Test = new File("Quiz.txt");

        Scanner input = new Scanner(Test);

        double[] content = new double[8];
        while(input.hasNextLine()){
            System.out.println(input.nextLine());
            content[0]= 1;
            content[1]= 2.3;
            content[2]= -1.4;
            content[3]= 40;
            content[4]= -4;
            content[5]= 0;
            content[6]= 0.02;
            content[7]= 25;
            Arrays.sort(content, 0, 8);
        }

        FileWriter output = new FileWriter("Sorted.txt");
        output.write(Arrays.toString(content));


        output.close();
        File Test1 = new File("Sorted.txt");

        Scanner input1 = new Scanner(Test1);

        System.out.println(Arrays.toString(content));


        input.close();
    }
}
