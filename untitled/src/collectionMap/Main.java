package collectionMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){


        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1234, "Tisch viru");
        map1.put(234, "Stuhl jsdfdf");


        System.out.println("Wert: " + map1.get(1234));

        for (Integer key:map1.keySet()) {
            System.out.println("Artikelnummer: " + key);
            String value = map1.get(key);
            System.out.println("Wert: " + value);


        }
    }
}
