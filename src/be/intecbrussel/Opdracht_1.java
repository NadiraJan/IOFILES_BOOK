package be.intecbrussel;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Opdracht_1 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\Nadira\\Doc2.txt");  //ОПРЕДЕЛИТЬ ПУТЬ(DEFINE PATH)

            Files.createDirectories(path.getParent());//CREATE PARENT DIRECTORIES

            if (Files.notExists(path)) {     //CREATE IF NOT EXISTS

                Files.createFile(path);
                System.out.println("File created");
            } else {
                System.out.println("File already exists");  //RESULT: File already exists IN de PC:
                //you can see: C:\Nadira\Doc2.txt
            }

            List<String> lines = new ArrayList<>(); //Write lines of text to file
            lines.add("Hello");
            lines.add("World");
            Files.write(path, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
//result: in the file you can read a text: HELLO WORLD

            //Retrieve attributes of file:
            DosFileAttributes attr = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(attr.size());
            System.out.println(attr.creationTime());
            System.out.println(attr.lastAccessTime());
            System.out.println(attr.lastModifiedTime());
            System.out.println(attr.isArchive());
            System.out.println(attr.isHidden());
            System.out.println(attr.isReadOnly());

            Files.lines(path).forEach(System.out::println); //Read lines of text from file

            Path path1 = Paths.get("C:\\nadira\\file_copy.txt"); //Copy File
            Files.copy(path, path1, StandardCopyOption.REPLACE_EXISTING);
            //result: in the folder you can see file_copy.txt

            Files.deleteIfExists(path); //Delete file
            //RESULT: the original file Doc2.txt is removed

            Files.getOwner(path1);// To define Owner of file
            System.out.println(Files.getOwner(path1)); //RESULT: DESKTOP-08PL374\Gebruiker (User)

            //RENAME FILE:
            Path source = Paths.get("C:\\nadira\\file_copy.txt");
            Path target = Paths.get("C:\\nadira\\file_copy3.txt"); //RESULT: IN FOLDER:file_copy2.txt


                Files.move(source, target);

            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
