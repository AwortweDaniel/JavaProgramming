import java.sql.SQLOutput;
import java.util.Arrays;

public class practQuiz4{
    public static void main(String[] args) {
        int [][] Credit_hours_Marks = {{3,80},{2,93},{1,75},{3,82}};
        System.out.println(Arrays.deepToString(Credit_hours_Marks));

        int totalCredit=0;
        for (int i= 0;i< Credit_hours_Marks.length;i++){
            totalCredit+= Credit_hours_Marks[i][0];
        } double semesterAverage=0;
        for (int i =0; i < Credit_hours_Marks.length; i++){
            semesterAverage += Credit_hours_Marks[i][0]* Credit_hours_Marks[i][1];
        }
        semesterAverage/= totalCredit;
        System.out.println("Total Credit hours:" + totalCredit);
        System.out.println("Semester Average:" + semesterAverage);
    }
}
