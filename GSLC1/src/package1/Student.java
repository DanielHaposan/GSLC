package package1;



public class Student {
    private String name;
    private int year;
    private float gpa;
    
    public Student( String name, int year,float gpa) {
       
        this.name = name;
        this.year = year;
        this.gpa = gpa;
       
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }
    
    public float getgpa() {
        return gpa;
    }


    public void setgpa(float gpa) {
        this.gpa = gpa;
    }
}