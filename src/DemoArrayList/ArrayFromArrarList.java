package DemoArrayList;

import java.util.ArrayList;

public class ArrayFromArrarList {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(10);
        intArr.add(40);
        intArr.add(30);

        Integer[] myIntArray = new Integer[intArr.size()];
        myIntArray = intArr.toArray(myIntArray);

        for (Integer intVal:myIntArray){
            System.out.println(intVal);
        }

        ArrayList<String> strArr =  new ArrayList<>();
        strArr.add("Jan");
        strArr.add("Feb");
        strArr.add("Mar");

        String[] myStrArray = new String[strArr.size()];
        myStrArray = strArr.toArray(myStrArray);

        for (String val:myStrArray){
            System.out.println(val);
        }
    }
}
