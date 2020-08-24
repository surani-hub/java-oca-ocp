package EnhancedFoorLoopDemo;

import java.util.ArrayList;

public class EnhancedFor {
    public static void main(String[] args) {
        ArrayList<String> exams = new ArrayList<>();
        exams.add("Java");
        exams.add("Oracle");

        ArrayList<String> levels = new ArrayList<>();
        levels.add("Basic");
        levels.add("Advanced");

        ArrayList<String> grades = new ArrayList<>();
        grades.add("Pass");
        grades.add("Fail");

        for (String exam:exams){
            for (String level:levels){
                for (String grade :grades){
                    System.out.println(exam+" : "+ level+" : "+grade);
                }
            }
        }


    }
}
