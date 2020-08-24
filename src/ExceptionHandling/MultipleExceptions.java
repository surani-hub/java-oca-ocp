package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleExceptions {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
            System.out.println("File opened");
            fis.read();
            System.out.println("Read file");
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        } catch (IOException ioException){
            System.out.println("I/O exception");
        }finally {
            System.out.println("Finally");
        }
        System.out.println("Next task ..");
    }

}
