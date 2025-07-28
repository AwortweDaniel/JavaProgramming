import java.util.Arrays;

public class PracticeArrays {
    public static void main(String[] args) {
        //CREATE A SD ARRAY OF DOUBLES
        double marks [] =new double[10];

        //CREATE A SD ARRAY OF INTEGER
        int ages[]= new int[6];

        //CREATE A SD ARRAY OF STRING
        String stuName[] = new String[5];

        //CREATING
        double distance[] = {0.9, 34.2, 1.21, 0.787};

        //DISPLAY CONTENT OF A SD ARRAY
        System.out.println("Before content addition");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(stuName));
        System.out.println(Arrays.toString(distance));

        //ADDING CONTENTS

        for (int i =0; i < marks.length; i++){
            marks[i] = (i+ 2)* 4;
        }

        double newmarks[] = marks;
        double clonemark[] = marks.clone();

        System.out.println("After content addition");
        System.out.println(Arrays.toString(marks));
        //System.out.println(Arrays.toString(ages));
        //System.out.println(Arrays.toString(stuName));
        //System.out.println(Arrays.toString(distance));


        //SORTING AN ARRAY
        System.out.println("before Sorting");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(newmarks));
        System.out.println(Arrays.toString(clonemark));

        System.out.println("\nAfter sorting");
        Arrays.sort(marks);
        Arrays.sort(newmarks,4,9);
        Arrays.sort(clonemark,3,7);
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(newmarks));
        System.out.println(Arrays.toString(clonemark));

    }
}
