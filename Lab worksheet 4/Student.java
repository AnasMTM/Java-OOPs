package UniversityManagementSystem;

import java.util.ArrayList;

public class Student extends Person{
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled = new ArrayList<Course>();

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Student(String name, String studentID, String year) {
        super(name);
        this.studentID = studentID;
        this.year = year;
    }

    public void registerDegree(Degree degree){
        degree = degree;
    }

    public void displayDegreeInfo(){
        degree.displayInfo();
    }

    public void enrollCourse(Course course){
        coursesEnrolled.add(course);
    }

    public void unenrollCourse(Course course){
        coursesEnrolled.remove(course);
    }

    public void listCoursesEnrolled(){
        for (Course i : coursesEnrolled){
            System.out.println(i.getName());
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name\t\t\t : " + getName() );
        System.out.println("Student ID \t\t\t\t : " + studentID);
        System.out.println("Student Year \t\t\t : " + year);
        System.out.println("Student Degree\t\t\t : " +  degree.getName());
        System.out.println("Student Course enroll\t : " + coursesEnrolled.size());
        for (Course i : coursesEnrolled){
            System.out.println("\t\t - " + i.getName());
        }
    }
}
