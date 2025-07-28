import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filereader2 {
    public static void main(String[] args) throws FileNotFoundException {
        File textFile = new File("C:\\Users\\user\\Desktop\\test.txt");
        Scanner input = new Scanner(textFile);
        while(input.hasNextLine()){
        System.out.println(input.nextLine());
    }}
}
