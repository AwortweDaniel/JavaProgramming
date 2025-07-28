import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileReadingAssignment {
    public static void main(String[] args) throws IOException {

        File testFile = new File("test.txt");


        Scanner input = new Scanner(testFile);

        String fileContent = "";
        while (input.hasNextLine()) {
            fileContent = fileContent.concat(input.nextLine() + "\n");

        }

        FileWriter output = new FileWriter("out.txt");
        output.write(fileContent.toUpperCase());
        output.close();

        File newFile = new File("out.txt");
        Scanner secondFile = new Scanner(newFile);
        while (secondFile.hasNextLine()) {
            System.out.println(secondFile.nextLine());
        }
        secondFile.close();

    }
}
