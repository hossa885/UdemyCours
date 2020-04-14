package Pfad;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main (String[] args) throws IOException {
        //Pfad erstellen
        //Windows Pfad: C:\\home\\user\\Desktop\\Test.txt
        Path path = Paths.get("C:\\Users\\AboukhadraHos\\Desktop\\Test.txt");

        //Methoden
        System.out.println("toString: " + path.toString());
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getName: " + path.getName(1));
        System.out.println("getCountName: " + path.getNameCount());
        System.out.println("subPath: " + path.subpath(0, 2));
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("absolutePath: " + path.toAbsolutePath());
        System.out.println("normalize: " + Paths.get("C:\\\\Benutzer\\AboukhadraHos\\/..\\Test.txt").normalize());

        System.out.println("----------------------------");

        //Datei erstellen
        //filesystem
        FileSystem filesystem = FileSystems.getDefault();
        System.out.println(filesystem);

        File file = new File("C:\\Users\\AboukhadraHos\\Desktop\\Test.jpg");

//        boolean fileExists = file.exists();
//
//        if (fileExists){
//            System.out.println("Datei vorhanden");
//        }else{
//            System.out.println("Datei nicht vorhanden");
//        }
//        System.out.println("----------------------------");
//
//        //File Länge / größe
//        long lenght = file.length();
//        System.out.println("Datei größe: " + lenght);
//
//        System.out.println("----------------------------");
//        //ist das File Objekt eine datei oder ein Ordner
//        boolean istDic = file.isDirectory();
//
//        if(istDic){
//
//            System.out.println("Es ist ein ordner");
//        }else{
//
//            System.out.println("Es ist eine Datei");
//        }
//        System.out.println("----------------------------");
        //Name ändern
//        boolean changeName = file.renameTo(new File("C:\\Users\\AboukhadraHos\\Desktop\\Test.txt"));
//
//        if (changeName){
//            System.out.println("Name wurde geändert");
//        }else {
//            System.out.println("Name wurde nicht geändert");
//        }
//        System.out.println("----------------------------");

//        try {
//            file.createNewFile();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        //Ordner erstellen
//        File newDir = new File("C:\\Users\\AboukhadraHos\\Desktop\\Test\\Java Dateien");
//        boolean completedDir = newDir.mkdirs();
//
//        if (completedDir){
//            System.out.println("Date wurde erstellt");
//        }else {
//            System.out.println("Name wurde nicht erstellt");
//        }
//        System.out.println("----------------------------");
//        File newOrd = new File("C:\\Users\\AboukhadraHos\\Desktop\\Test\\Java Dateien\\Udemy Projekt");
//
//        newOrd.mkdir();

        // Liste von Dateien innerhalb eines Ordners anzeigen--> Entweder als String- oder File -Array

//        String[] filenames = newDir.list();
//        File[] files = newDir.listFiles();
//
//        for (File file2 : files){
//            System.out.println("Name: " +file2.getAbsolutePath());
//            file2.delete();
//        }

        // aus  einem File den Path
//        File file2 = new File("C:\\Users\\AboukhadraHos\\Desktop\\Test.jpg");
//
//        try {
//            file2.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        Path path2 = file2.toPath();
//        System.out.println(path2);
        //Aus einem Path ein File erstellen
//        Path path3 = Paths.get("C:\\Users\\AboukhadraHos\\Desktop\\testHossam2.jpg");
//        File file3 = path3.toFile();
//        try {
//            file3.createNewFile();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //file seperator
        System.out.println("-------------------------");

        String fileSeperator = System.getProperty("file.seperator");
        System.out.println(fileSeperator);
//
//        String absoluterPath = fileSeperator + "Users" + fileSeperator + "AboukhadraHos" +fileSeperator + "Desktop" + fileSeperator + "text.txt";
//        System.out.println(absoluterPath);

    }


}
