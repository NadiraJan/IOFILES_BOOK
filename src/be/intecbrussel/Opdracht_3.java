package be.intecbrussel;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Opdracht_3 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("MyFile1.txt");
            int character;
            while ((character = fileReader.read()) !=-1){
                System.out.print((char)character);

            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage()); //RESULT: Hello WorldHello World
        }

    }
}
