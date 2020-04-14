package Enum;

enum Gender {male, Female};
enum Course {Database, Programming, Math, ERB};
enum Semester {Summer, Winter, Fall, Spring};

public class RegisterForm {
    String stdName;
    Gender stdgender;
    Course crs;
    Semester sem;

    public RegisterForm ( ) {
        stdName = "No Name";
        stdgender = Gender.male;
        crs = Course.Math;
        sem = Semester.Spring;

    }


}
