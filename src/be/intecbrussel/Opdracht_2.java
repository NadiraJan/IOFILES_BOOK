package be.intecbrussel;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Opdracht_2 {
    public static void main(String[] args) throws IOException {

     try(FileWriter file1 = new FileWriter("MyFile1.txt")){

        file1.write("Hello World");
        file1.write("Hello World");
    } catch (IOException ex){
         System.out.println("Smthg wrong");
         System.out.println(ex.getMessage()); //RESULT: IN DE FOLDER WAARIN ZIT DEZE PROJECT ZIE JE
         //HET BESTAND MyFile1.txt
        }
     Path path = Paths.get("File.txt");
             FileWriter fileWriter = new FileWriter(path.toFile());
    }
}


