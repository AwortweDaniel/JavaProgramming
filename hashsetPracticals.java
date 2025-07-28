import java.util.HashSet;
import java.util.Set;

public class hashsetPracticals {
    public static void main(String[] args) {
        System.out.println("\n================");
        System.out.println("creating sets");
        //creation of hashsets
        Set<Integer> stdAge = new HashSet<>();
        HashSet<String> stdNames = new HashSet<String>();
        HashSet<Double> stdMarks = new HashSet<>();

        System.out.println("\n================");
        System.out.println("adding contents to the sets");
        //adding contents to a hashsets
        stdAge.add(26);
        stdAge.add(68);
        stdAge.add(32);

        stdMarks.add(55.89);
        stdMarks.add(43.67);
        stdMarks.add(89.9);

        stdNames.add("Esi");
        stdNames.add("Nana");
        stdNames.add("Papa");
        stdNames.add("Joe");

        HashSet<String> stdNames1 = new HashSet<>();
        stdNames1.add("Naana");
        stdNames1.add("Nana");
        stdNames1.add("Ekuwa");
        stdNames1.add("Adjoa");

        HashSet<String> stdNames2 = new HashSet<>();
        stdNames2.add("Kwabena");
        stdNames2.add("Nana");
        stdNames2.add("Efua");
        stdNames2.add("Adjoa");

        System.out.println(stdNames);
        System.out.println(stdMarks);
        System.out.println(stdAge);
        System.out.println(stdNames1);
        System.out.println(stdNames2);

        System.out.println("\n================");
        System.out.println("after union of sets");
        //Union set
        stdNames.addAll(stdNames1);
        System.out.println(stdNames);
        System.out.println(stdNames1);
        System.out.println("\n================");
        System.out.println("after subtraction of sets");
        //Set Subtraction
        stdNames.removeAll(stdNames1);
        System.out.println(stdNames);
        System.out.println("\n================");
        System.out.println("after intersection of sets");
        //Set intersection
        stdNames.retainAll(stdNames1);
        System.out.println(stdNames);
        System.out.println(stdNames1);



    }
}
