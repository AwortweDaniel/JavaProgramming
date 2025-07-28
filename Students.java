public class Students {
    public static void main(String[] args) {
        //Assignment
        //Create a class for Umat students
        //Student should have a name, Year of birth, hometown, department,
        // programme, year of study, hostel/hall, cwa, gender
        //and should be able to change either password, department, cwa

        Students Std1= new Students("Dan","male",2003, "Takoradi","Computer Science& Engineering",2, "KT Hall",85.0);
        System.out.println(Std1.getName());
        System.out.println(Std1.getGender());
        System.out.println(Std1.getYear_of_birth());
        System.out.println(Std1.getProgramme());
        System.out.println(Std1.getHostel());
        System.out.println(Std1.getCwa());
        System.out.println(Std1.getYear_of_study());


        Std1.setCwa(95.0);
        System.out.println(Std1.getCwa());
        Std1.setProgramme("Mathematics");
        System.out.println(Std1.getProgramme());
    }

    /**
     * This class represent Umat students
     * Stores information such as name, gender, year of birth, hometown, department, year of study, hostel, cwa
     */
    private String name;
    private String gender;
    private int year_of_birth;
    private String hometown;
    private String department;
    private String programme;
    private int year_of_study;
    private String  hostel;
    private double cwa;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear_of_study() {
        return year_of_study;
    }

    public void setYear_of_study(int year_of_study) {
        this.year_of_study = year_of_study;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getCwa() {
        return cwa;
    }

    public void setCwa(double cwa) {
        this.cwa = cwa;

    }

    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public Students(String name, String gender, int year_of_birth, String hometown, String programme,
                    int year_of_study, String hostel, double cwa ){
        this.name= name;
        this.gender= gender;
        this.year_of_birth=year_of_birth;
        this.department= department;
        this.programme=programme;
        this.year_of_study= year_of_study;
        this.hostel= hostel;
        this.cwa= cwa;
    }

    public String toString(){
        return "Students: "+
                "name'" +name + "\'"+ ", gender" + gender+ "\'"+
                "year_of_birth'" +year_of_birth + "\'" +
                "department'" +department +"\'" +
                "programme'" +programme + "\'" +
        "year_of_study'" + "\'" +
                "hostel'" +hostel +"\'" +
                "cwa'" +cwa +"\'";}
}
