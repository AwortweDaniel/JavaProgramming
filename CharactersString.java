public class CharactersString {
    public static void main(String[] args) {
        //Escape sequences in Java \t \n \" \' \b
        System.out.println("test tab\tcheck");
        System.out.println("test newline\ncheck");
        System.out.println("test double quotation\"check\"");
        System.out.println("test single quotation \'check\'");
        //Casting Characters as Numbers and vice versa
        //what character numbers represent

        System.out.println("5256 reps char: "+ (char)5256);
        System.out.println("525 reps char: "+ (char)525);
        System.out.println("2665 reps char: "+ (char)2665);
        System.out.println("2002 reps char: "+ (char)2002);

        //What number characters are stored
        System.out.println("'\' stored as num: " + (int)' ');
        System.out.println("\'+\' stored as num: " + (int)'+');
        System.out.println("\'A\' stored as num: " + (int)'A');
        System.out.println("\'?\' stored as num: " + (int)'?');

        //Character Declaration
        char letter = 'A';
        char num = '2';
        System.out.println("Is "+ letter + " a number?\n"+ Character.isDigit(letter));
        System.out.println("Is "+ num + " a number?\n"+ Character.isDigit(num));
        String n = "John";
        System.out.println(n.indexOf("n"));

        //STRING DATA TYPE
        String fname = "Nana ";
        String sname = "nana";
        System.out.println(fname+" is "+fname.length()+ " length");
        System.out.println(fname.concat(sname));
        System.out.println(Character.isUpperCase(fname.charAt(1)));
        System.out.println(fname.equals(sname));
        System.out.println(fname.equalsIgnoreCase(sname));
    }
}
