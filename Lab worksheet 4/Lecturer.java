package UniversityManagementSystem;

import java.util.ArrayList;

public class Lecturer extends Person{
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching = new ArrayList<Course>();

    public Lecturer(String name, String position) {
        super(name);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDepartmentInfo(){
        department.displayInfo();
    }

    public void addCourse(Course coursesTeaching){
        this.coursesTeaching.add(coursesTeaching);
    }

    public void removeCourse(Course coursesTeaching){
        this.coursesTeaching.remove(coursesTeaching);
    }

    public void listCoursesTeaching(){
        for (Course i : coursesTeaching){
            System.out.println(i.getName());
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Name\t\t\t\t\t : " + getName());
        System.out.println("Lecturer Position\t\t\t\t : " + getPosition());
        System.out.println("Lecturer Deparment\t\t\t\t : " + department.getName());
        System.out.println("Lecturer No of Teaching Course\t : " + coursesTeaching.size());
        for (Course course : coursesTeaching){
            System.out.println("\t\t - " + course.getName());
        }

    }
}
