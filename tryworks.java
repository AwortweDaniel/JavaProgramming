import java.lang.reflect.Array;
import java.util.Arrays;

public class tryworks {
    public static void main(String[] args) {
        int [][]marks = new int[3][2];
        int [][]ages = {{4,5},{6,7},{8,9},};

        for (int i = 0; i< marks.length;i++){
for (int k =0; k< marks[i].length; k++){
    marks[i][k] = (int) Math.floor(Math.random()*40);
}
            }System.out.println(Arrays.deepToString(marks));

        for (int y=0; y< ages.length;y++){
            for (int z= 0; z< ages[y].length; z++){
                System.out.println(ages[y][z]);
            }
            System.out.println();
        }
    }
}
