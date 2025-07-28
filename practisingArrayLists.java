import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class practisingArrayLists {
    public static void main(String[] args) {
        //CREATE AN ARRAYLIST
        ArrayList<String>stdNames = new ArrayList<>();
        ArrayList<String>homeTown = new ArrayList<>();
        ArrayList<Double>stdMarks = new ArrayList<>();
        ArrayList<String>newNames = new ArrayList<>();
        System.out.println(stdMarks.size());

        //ADDING CONTENT TO ARRAY LIST
        stdNames.add("Daniel");
        stdNames.add("20.34");
        stdNames.add("Nana");
        stdNames.add("Junior");
        homeTown.add("Accra");
        homeTown.add("Abuja");
        homeTown.add("Cairo");
        System.out.println(stdNames);
        stdNames.add(1,"Awor");

        System.out.println("=====================");
        //LOOP TO ADD CONTENT
        for (int i =0;i< 100; i++){
            //MULTIPLES OF BOTH 3 AND 4
            if ((i% 3== 0)&&(i %4==0)){
                stdMarks.add(i * 1.0);
            }
        }
        System.out.println("=====================");
        //REMOVE ITEM FROM ARRAYLIST
        stdNames.remove("20.34");
        System.out.println(stdNames);
        System.out.println("=====================");
        //CHECK ARRAYLIST CONTAINS AN ELEMENT
        System.out.println(stdNames.contains("Nana"));
        System.out.println("=====================");
        //GET ELEMENT AT AN INDEX
        System.out.println(stdMarks.get(3));
        System.out.println("=====================");
        //SORT ARRAYLIST
        System.out.println("Before sorting");
        System.out.println(stdNames);
        System.out.println("after sorting");
        Collections.sort(stdNames);
        System.out.println(stdNames);
        System.out.println("=====================");
        //REVERSE ARRAYLIST
        System.out.println("Before reversing");
        System.out.println(stdNames);
        System.out.println("After reversing");
        Collections.reverse(stdNames);
        System.out.println(stdNames);
        System.out.println("=====================");
        //ADD ALL CONTENT FROM ONE ARRAYLIST TO ANOTHER
        newNames.add("Araba");
        newNames.add("selasi");
        System.out.println("Before addAll");
        System.out.println(newNames);
        newNames.addAll(stdNames);
        System.out.println(newNames);
        System.out.println("=====================");

    }
}
