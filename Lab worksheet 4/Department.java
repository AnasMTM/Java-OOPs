package UniversityManagementSystem;

import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering = new ArrayList<Course>();
    private ArrayList<Lecturer> lecturersBelongsTo = new ArrayList<Lecturer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecturer getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(Lecturer departmentHead) {
        this.departmentHead = departmentHead;
    }

    public ArrayList<Lecturer> getLecturersBelongsTo() {
        return lecturersBelongsTo;
    }

    public void setLecturersBelongsTo(ArrayList<Lecturer> lecturersBelongsTo) {
        this.lecturersBelongsTo = lecturersBelongsTo;
    }

    public Department(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(Lecturer lecturer){
        this.departmentHead = lecturer;
    }

    public void displayDepartmentHeadInfo(){
        departmentHead.displayInfo();
    }

    public void offerCourse(Course course){
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course){
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer){
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer){
        lecturersBelongsTo.remove(lecturer);
    }

    public void displayInfo(){
        System.out.println("Department Name\t\t\t\t\t : " + name );
        System.out.println("Department Head\t\t\t\t\t : " + departmentHead.getName() );
        System.out.println("Department Course offering\t\t : " + coursesOffering.size() );
        int count = 1;
        for (Course i : coursesOffering){
            System.out.println("\t" + count +" - " + i.getName());
        }
        count = 1;
        System.out.println("Department Lecturers belong to\t : " + lecturersBelongsTo.size());
        for (Lecturer i : lecturersBelongsTo){
            System.out.println("\t" + count + " - " + i.getName());
            count++;
        }
    }
}
