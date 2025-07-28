public class variables {
    //ENUMERATED TYPES
    enum Course{CE, CY, IS}
    public static void main(String[] args) {
        //VARIABLE DECLARATION
        int studentAge = 46;
        double hostelDistance  = 9.45;
        float height;

        System.out.println(studentAge);

        //STRING VARIABLES
        String studentName = "Selasi";
        String studentHostel = "Camp city";

        System.out.println(studentName + ":" + studentHostel );

        //CONSTANT VARIABLES
        final int YOB = 1974;

        int age = 2024 - YOB;
        System.out.println(age);

        Course studentCourse = Course.CE;
        System.out.println(studentName+ ": "+ studentCourse);
    }
}
