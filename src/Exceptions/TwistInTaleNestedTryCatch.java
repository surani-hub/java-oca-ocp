package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TwistInTaleNestedTryCatch {
    static FileInputStream players, coach;
    public static void main(String[] args) {
        try {
            players = new FileInputStream(new File("players.txt"));
            System.out.println("players.txt found");
           // String currentDirectory = System.getProperty("user.dir");
            //System.out.println("Current Dir: " + currentDirectory);
            try {
                coach.close();
            } catch (IOException ioException){
                System.out.println("coach.txt not found");
            }
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("players.txt not found");
        } catch (NullPointerException nullPointerException){
            System.out.println("NullPointerException");
        }
    }
}
