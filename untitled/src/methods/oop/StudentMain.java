package methods.oop;

public class StudentMain {

    public static void main(String[] args){

        Students s1 = new Students(10, "Hossam Mohamed");
        s1.StudentCode = "22";
        s1.BranchName = "Information Systems";

        System.out.println(s1.getAllDataInString());

        Students s2 = new Students();
        s2.StudentCode="bb222";
        s2.BranchName = "accounting";
        System.out.println(s2.getAllDataInString());

//        Students s3 = new Students(33, "Fawzy");
//        System.out.println(s3.getAllDataInString());
    }
}
