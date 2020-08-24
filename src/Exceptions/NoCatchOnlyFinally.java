package Exceptions;

public class NoCatchOnlyFinally {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println("Try block : open source 1");
            System.out.println("Try block : open source 2");
            System.out.println("Try block : open source 3");
            System.out.println("Try block : open source 4");
        } finally {
            System.out.println("Finally block : close resources");
        }
    }
}
