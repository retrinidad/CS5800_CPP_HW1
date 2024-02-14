public class Course {
    private String CourseName;
    private Instructor CourseInstructor;
    private Textbook CourseTextbook;

    Course(String CourseName, Instructor CourseInstructor, Textbook CourseTextbook){
        this.CourseName = CourseName;
        this.CourseInstructor = CourseInstructor;
        this.CourseTextbook = CourseTextbook;
    }
    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public void PrintCourseDetails(){
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Course Instructor: " + CourseInstructor.getFirstName() + " " + CourseInstructor.getLastName() + " " + " Office Number: " + " " + CourseInstructor.getOfficeNumber());
        System.out.println("Textbook Title: " + CourseTextbook.getTitle());
        System.out.println("Textbook Author: " + CourseTextbook.getAuthorName());
    }
}
