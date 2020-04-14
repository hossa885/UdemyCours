package methods.oop;

public class Students {





    public Students(int Student_Number, String Student_name){
        System.out.println("\nnew Studen is created........\n");
        StudentNumber = Student_Number;
        StudentCode = "Empty code";
        StudentName = Student_name;
        BranchName = "Empty branch";

    }

    public Students(){

    }





    public int StudentNumber;
    public String StudentCode;
    public String StudentName;
    public String BranchName;
    private static double grade;

    public String[] getAllData() {
        String strAll[] = {String.valueOf(StudentNumber), StudentCode, StudentName, BranchName, String.valueOf(grade)};
        return strAll;
    }

    public String getAllDataInString() {

        String strAll = String.valueOf(StudentNumber) + " ; " +  StudentCode +" ; " + StudentName + " ; " + BranchName + " ; " + String.valueOf(grade);
        return strAll;
    }
}
