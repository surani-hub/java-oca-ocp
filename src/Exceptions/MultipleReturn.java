package Exceptions;

public class MultipleReturn {
    int getInt(){
        int returnVal = 10;
        try {
            String[] students = {"Harry", "Paul"};
            System.out.println(students[5]);
        } catch (Exception e){
            System.out.println("In catch block: " + returnVal);
            return returnVal;
        } finally {
            returnVal +=10;
            System.out.println("Return value now: " + returnVal);
        }
        return returnVal;
    }

    public static void main(String[] args) {
        MultipleReturn var = new MultipleReturn();
        System.out.println("In main : " + var.getInt());
    }

}
