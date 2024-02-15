public class Question_3 {
    public static void main(String[] args) {
        Instructor Davarpanah =  new Instructor("Nima","Davarpanah","3-2636");
        Instructor Johnson = new Instructor("Dwayne","Johnson","6-5272");
        Textbook CleanCode = new Textbook("Clean Code","Robert C. Martin", "Prentice Hall");
        Textbook ComputerScience = new Textbook("Computer Science with Dwayne Johnson", "Dwayne Johnson","Cool Books Publishing");
        Course CS5800 = new Course("Advanced Software Engineering", Davarpanah, Johnson, CleanCode,ComputerScience);

        CS5800.PrintCourseDetails();
    }
}
