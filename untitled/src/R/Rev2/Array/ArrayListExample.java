package R.Rev2.Array;

import java.util.Arrays;

public class ArrayListExample<E> { //E - ist nur Platzhalter für den Typ der objekte in der liste

    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object elements[];


    public ArrayListExample ( ) {
        elements = new Object[ DEFAULT_CAPACITY ];
    }

    public void add (E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[ size++ ] = e;
    }

    private void ensureCapacity ( ) {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get (int index) {

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " , Size" + index);
        }
        return (E) elements[index];

    }
    public static void main(String[] args){

        ArrayListExample<String> listExample = new ArrayListExample<>();
        listExample.add("Person 1");
        listExample.add("Person 2");
        listExample.add("Person 3");
        listExample.add("Person 4");
        listExample.add("Person 5");
        listExample.add("Person 6");
        listExample.add("Person 7");
        System.out.println(listExample.get(0));
    }
}
