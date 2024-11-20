package UniversityManagementSystem;

import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering = new ArrayList<Course>();

    public Degree(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course){
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course){
        coursesOffering.remove(course);
    }

    public void listCoursesOffering(){
        for (Course i : coursesOffering){
            System.out.println("\t\t - " + i.getName());
        }
    }

    public void displayInfo(){
        System.out.println("Degree name\t\t\t\t\t : " + name);
        System.out.println("Degree no of Students\t\t : " + numberOfStudents);
        System.out.println("Degree courses offering\t\t : " + coursesOffering.size());
        for (Course i : coursesOffering){
            System.out.println("\t\t - " + i.getName());
        }
    }
}
