package Revision;

public class Main {

    public static void main(String[] args){

        int[] array = new int[10];

        array[0] = 0;
        array[1] = 10;
        array[2] = 20;
        array[3] = 30;
        array[4] = 40;
        array[5] = 50;
        array[6] = 60;
        array[7] = 70;
        array[8] = 80;
        array[9] = 90;

        for (int i = 0; i<array.length; i++){
            System.out.println("Index: " + i + " Inhalt " + array[i]);
        }

        System.out.println("----------------------------");
        int[] numbers = {10, 20, 30, 40, 50, 70};

        for (int i = 0; i<numbers.length; i++){
            System.out.println("Index: " + i + " Inhalt " + numbers[i]);
        }

        System.out.println("----------------------------");
        //3 Zeilen 3 Spalten
        int[][] array2D = new int[3][3];

        array2D[0][0] = 30;
        array2D[0][1] = 40;
        array2D[2][1] = 543;
        array2D[1][1] = 2;

        System.out.println("Länge" + array2D.length);

        for (int zeile = 0; zeile<array2D.length; zeile ++){
            for (int spalte = 0; spalte<array2D[zeile].length; spalte++){
                System.out.print(array2D[zeile][spalte] + "\t");
            }
            System.out.println();

        }

        System.out.println("----------------------------");


        int[][] nextArray2D= {
                {22,40,50},
                {33,56,80},
                {11,3,6},
                {222,444,50}

        };
        System.out.println("Zeilen der Tabelle: " + nextArray2D.length);
        for (int zeile = 0; zeile<nextArray2D.length; zeile ++){
            for (int spalte = 0; spalte<nextArray2D[zeile].length; spalte++){
                System.out.print(nextArray2D[zeile][spalte] + "\t");
            }
            System.out.println();

        }
        System.out.println(nextArray2D[3][0]);

    }

}
