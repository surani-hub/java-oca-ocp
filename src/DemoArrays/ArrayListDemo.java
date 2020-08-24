package DemoArrays;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
        String one = "ONE";
        String two = new String("TWO");

        myArrList.add(one);
        myArrList.add(two);

        ArrayList<String> yourArrList = myArrList;
        one.replace("O", "B");

        // myArrList.clear();

        for (String val:myArrList){
            System.out.println(val);
        }

        for (String val:yourArrList){
            System.out.println(val);
        }

        System.out.println(myArrList.get(1));
        System.out.println(myArrList.size());
        System.out.println(myArrList.contains(one));
        System.out.println(myArrList.indexOf("three"));
        System.out.println(myArrList.lastIndexOf("three"));

 //System.out.println(myArrList.toArray());
   /*Object[] strArray =  myArrList.toArray();

   for (Object val: strArray){
       System.out.println(val);
   }*/

        String[] strArray = new String[myArrList.size()];
        strArray = myArrList.toArray(strArray);

        for (String val: strArray){
            System.out.println(val);
        }
    }
}
