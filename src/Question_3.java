public class Question_3 {
    public static void main(String[] args) {
        Instructor Davarpanah =  new Instructor("Nima","Davarpanah","3-2636");
        Textbook CleanCode = new Textbook("Clean Code","Robert C. Martin", "Prentice Hall");
        Course CS5800 = new Course("Advanced Software Engineering", Davarpanah, CleanCode);

        CS5800.PrintCourseDetails();

        System.out.println();

        Instructor Cena = new Instructor("John","Cena","6-5272");
        Textbook StuntActing101 = new Textbook("Stunt Acting 101", "Dwayne Johnson","Cool Books Publishing");
        Course T6000 = new Course("Action Stunts for Beginners", Cena, StuntActing101);

        T6000.PrintCourseDetails();
    }
}
