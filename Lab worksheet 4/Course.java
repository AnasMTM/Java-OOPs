package UniversityManagementSystem;

public class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void addLecturerInCharge(Lecturer lecturer){
        lecturerInCharge = lecturer;
    }

    public void removeLecturerInCharge(){
        lecturerInCharge = null;
    }

    public void addDegreeBelongsTo(Degree degree){
        degreeBelongsTo = degree;
    }

    public void removeDegreeBelongsTo(){
        degreeBelongsTo = null;
    }

    public void displayInfo(){
        System.out.println("Course Name\t\t\t\t\t : " + name);
        System.out.println("Course Enroll type\t\t\t : " + enrollType);
        System.out.println("Course No of Student enroll\t : " + numberOfStudentsEnrolled);
        System.out.println("Course Lecturer in charge\t : " + lecturerInCharge.getName());
        System.out.println("Course Degree belong to\t\t : " + degreeBelongsTo.getName());
    }
}
