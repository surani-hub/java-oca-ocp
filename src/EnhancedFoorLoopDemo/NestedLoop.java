package EnhancedFoorLoopDemo;

import java.util.ArrayList;

public class NestedLoop {
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

         ArrayList<ArrayList<String>> nestedList = new ArrayList<ArrayList<String>>();
        nestedList.add(exams);
        nestedList.add(levels);
        nestedList.add(grades);

        for(ArrayList<String> val :nestedList){
            for (String ele :val){
                System.out.println(ele);
            }
        }

    }
}
