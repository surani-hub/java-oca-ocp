package ExceptionHandling;

public class InvalidArrayAccess {
    public static void main(String[] args) {
        String[] students = {"Shreya", "Joseph",null};
        /*try {
            System.out.println(students[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception");
        }
        System.out.println("All seems to be well");*/
        int pos = 3;
        if (pos>0 && pos>students.length){
            System.out.println(students[pos]);
        }
        System.out.println("All is well");

    }
}




