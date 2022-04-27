package be.intecbrussel;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Opdracht_4 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("MyFile.txt");
        try(BufferedReader reader = Files.newBufferedReader(path)){
            String line = null;
            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }

        } catch (IOException ex){
            System.out.println("smth wrong!");
            System.out.println(ex.getMessage()); //RESULT:smth wrong! MyFile.txt

        }
    }
}
