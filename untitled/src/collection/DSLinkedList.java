package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DSLinkedList {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<10000000; i++){
            list.add(i);
        }
        final long timeStart = System.currentTimeMillis();
        DSLinkedList.getZahl(199999, list);
        final long timeEnd = System.currentTimeMillis();
        System.out.println("Das Suchen dauert: " + (timeEnd-timeStart) + "Millisek.");
    }
    public static void getZahl(int index, List<Integer>list){
        System.out.println(list.get(index));
    }
}
