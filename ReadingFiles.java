import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) throws FileNotFoundException {

        //Read a text file in project folder
        File inputFile = new File("test.txt");

        //Read a test file outside the project folder
        File desktopFile = new File("C:\\Users\\user\\Desktop\\test.txt");


        //Check methods available on file variable
        System.out.println(desktopFile.exists());
        System.out.println(desktopFile.exists());
        System.out.println(inputFile.length());
        System.out.println(inputFile.canRead());
        System.out.println(inputFile.getTotalSpace());


        //READ CONTENT IN TEXT FILE
        Scanner input = new Scanner(inputFile);

        //open text file and read content
        //WHILE LOOP TO ITERATE THROUGH THE FILE
        while(input.hasNextLine()) {
            System.out.println(input.nextLine());
        }

        input.close();



    }
}
