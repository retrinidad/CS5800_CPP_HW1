public class Course {
    private String CourseName;
    private Instructor CourseInstructorA;
    private Instructor CourseInstructorB;
    private Textbook CourseTextbookA;
    private Textbook CourseTextbookB;

    Course(String CourseName, Instructor CourseInstructorA, Instructor CourseInstructorB, Textbook CourseTextbookA, Textbook CourseTextbookB){
        this.CourseName = CourseName;
        this.CourseInstructorA = CourseInstructorA;
        this.CourseInstructorB = CourseInstructorB;
        this.CourseTextbookA = CourseTextbookA;
        this.CourseTextbookB = CourseTextbookB;
    }
    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public void PrintCourseDetails(){
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Course Instructor A: " + CourseInstructorA.getFirstName() + " " + CourseInstructorA.getLastName() + " " + " Office Number: " + " " + CourseInstructorA.getOfficeNumber());
        System.out.println("Course Instructor B: " + CourseInstructorB.getFirstName() + " " + CourseInstructorB.getLastName() + " " + " Office Number: " + " " + CourseInstructorB.getOfficeNumber());
        System.out.println("Textbook Title A: " + CourseTextbookA.getTitle());
        System.out.println("Textbook Author: " + CourseTextbookA.getAuthorName());
        System.out.println("Textbook Title B: " + CourseTextbookB.getTitle());
        System.out.println("Textbook Author: " + CourseTextbookB.getAuthorName());
    }
}
