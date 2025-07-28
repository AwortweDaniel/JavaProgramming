

import java.util.Arrays;

public class multiDimensionalArray {
    public static void main(String[] args) {
        //CREATE 2D ARRAY
        double [][]marks = new double[5][2];
        int [][] ages= {{23,56,23},{74,92,3},{44,66,2}};
       //ADD CONTENT WITHOUT LOOPING
        marks[0][0] = 2.9;
        marks[0][1] = 3.5;

        System.out.println(Arrays.deepToString(marks));
        System.out.println(Arrays.deepToString(ages));

        System.out.println("======================");
        System.out.println(marks.length);
        System.out.println(marks[0].length);
        System.out.println(marks[3].length);
        System.out.println("=====================");
        System.out.println("Adding content with loops");
        //ADDING CONTENT WITH LOOPS
        for (int i=0; i < marks.length; i++){
            for(int k =0; k< marks[i].length;k++){
                marks[i][k] = Math.floor(Math.random()*25);
            }


        } System.out.println(Arrays.deepToString(marks));

        System.out.println("=====================");
        System.out.println("Getting content from 2D array");
        //GETTING CONTENT FROM 2D ARRAY
        double x = marks[0][1];
        System.out.println(x);
        System.out.println("=====================");
        System.out.println("Printing content from 2D array");
        //PRINTING CONTENT FROM 2D ARRAY
        for (int j = 0; j< marks.length; j++){
            System.out.println(Arrays.toString(marks[j]));
        }
        System.out.println("=====================");
        System.out.println("Printing item by item");
        //PRINT ITEM BY ITEM
        for (int y = 0; y < marks.length; y++){
            for (int z = 0; z < marks[y].length; z++){
                System.out.print(marks[y][z] + " ");
            }
            System.out.println();
        }
        //JAVA JAGGED MULTIDIMENSIONAL ARRAY
        int [][] stumarks = {{23,56,23},{74,92},{44,66,27},{44,8,2,3,4},{22, 34,12,6,7,23}};
    }



}
