package Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortedSetList {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<String>();


        list1.add("peter");
        list1.add("Adrian");
        list1.add("Michi");
        list1.add("peter");
        list1.add("Benrt");

// to print all Strings in ArrayList()
        for (String string:list1 ) {
            System.out.println(string);
            
        }
        // to sort all objects in ArrayList
        Collections.sort(list1);

        System.out.println("\nSortiert");
        for (String string:list1 ) {
            System.out.println(string);

        }
    }
}
