package Exceptions;

public class MultipleReturns {
    StringBuilder getStringBuilder(){
        StringBuilder returnVal = new StringBuilder("10");
        try{
            String[] students = {"Harry", "Paul"};
            System.out.println(students[5]);
        } catch (Exception e){
            System.out.println("In catch block: " + returnVal);
            return returnVal;
        } finally {
            returnVal.append("10");
            System.out.println("Finally block: " +returnVal);
        }
        return returnVal;
    }

    public static void main(String[] args) {
        MultipleReturns var = new MultipleReturns();
        System.out.println("In main: " + var.getStringBuilder());
    }
}
