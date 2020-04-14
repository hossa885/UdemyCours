package methods;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();
        students.add("Ahmed");
        students.add("Gamal");
        students.add("fawzy");
        students.set(0, "ibo");

        for (String str : students)
            System.out.println(str);

    }
}
