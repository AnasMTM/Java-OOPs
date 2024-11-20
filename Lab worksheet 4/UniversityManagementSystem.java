public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department softwareEngineering = new Department("Software Engineering");
        Department computerSystemEngineering = new Department("Computer System Engineering");
        Department appliedComputing = new Department("Applied computing");

        Degree computerScience = new Degree("Computer Science",90);
        Degree ICT = new Degree("Information and communication technology",85);
        Degree engineeringTechnology = new Degree("Engineering Technology",96);

        Course oops = new Course("OOPs",null,98);
        Course statistics = new Course("Statistics",null,186);
        Course structurePrograming = new Course("Structure Programing",null,175);

        Lecturer CSLecturer = new Lecturer("john","Head of department");
        Lecturer ETLecturer = new Lecturer("Kumar","Head of department");
        Lecturer CTLecturer = new Lecturer("Weerasinghe","Head of department");

        Student CSStudent = new Student("Kumaar","CS/001","2050");
        Student ETStudent = new Student("Anas","ET/001","5020");
        Student CTStudent = new Student("Kavinda","CT/001","3050");


        softwareEngineering.appointDepartmentHead(CSLecturer);
        softwareEngineering.addLecturer(ETLecturer);
        softwareEngineering.offerCourse(oops);

        appliedComputing.appointDepartmentHead(ETLecturer);
        appliedComputing.addLecturer(CSLecturer);
        appliedComputing.offerCourse(statistics);

        computerSystemEngineering.appointDepartmentHead(CTLecturer);
        computerSystemEngineering.addLecturer(ETLecturer);
        computerSystemEngineering.offerCourse(structurePrograming);

        computerScience.offerCourse(oops);

        ICT.offerCourse(structurePrograming);

        engineeringTechnology.offerCourse(statistics);

        oops.addLecturerInCharge(CSLecturer);
        oops.addDegreeBelongsTo(computerScience);
        oops.setEnrollType("Optional");

        statistics.addLecturerInCharge(ETLecturer);
        statistics.addDegreeBelongsTo(engineeringTechnology);
        statistics.setEnrollType("Compulsory");

        structurePrograming.addLecturerInCharge(CTLecturer);
        structurePrograming.addDegreeBelongsTo(ICT);
        structurePrograming.setEnrollType("compulsory");

        CSLecturer.setDepartment(softwareEngineering);
        CSLecturer.addCourse(oops);

        ETLecturer.setDepartment(appliedComputing);
        ETLecturer.addCourse(statistics);

        CTLecturer.setDepartment(computerSystemEngineering);
        CTLecturer.addCourse(structurePrograming);

        CSStudent.setDegree(computerScience);
        CSStudent.enrollCourse(oops);
        CSStudent.enrollCourse(statistics);

        ETStudent.setDegree(engineeringTechnology);
        ETStudent.enrollCourse(oops);
        ETStudent.enrollCourse(statistics);

        CTStudent.setDegree(ICT);
        CTStudent.enrollCourse(structurePrograming);
        CTStudent.enrollCourse(statistics);

        softwareEngineering.displayInfo();
        System.out.println();
        appliedComputing.displayInfo();
        System.out.println();
        computerSystemEngineering.displayInfo();
        System.out.println();
        computerScience.displayInfo();
        System.out.println();
        engineeringTechnology.displayInfo();
        System.out.println();
        ICT.displayInfo();
        System.out.println();
        oops.displayInfo();
        System.out.println();
        statistics.displayInfo();
        System.out.println();
        structurePrograming.displayInfo();
        System.out.println();
        CSLecturer.displayInfo();
        System.out.println();
        CTLecturer.displayInfo();
        System.out.println();
        ETLecturer.displayInfo();
        System.out.println();
        CSStudent.displayInfo();
        System.out.println();
        CTStudent.displayInfo();
        System.out.println();
        ETStudent.displayInfo();
    }
}
