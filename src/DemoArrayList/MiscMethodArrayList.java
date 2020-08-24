package DemoArrayList;

import java.util.ArrayList;

public class MiscMethodArrayList {
    public static void main(String[] args) {

        ArrayList<StringBuilder> myArrList = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Jan");
        StringBuilder sb2 = new StringBuilder("Feb");

        myArrList.add(sb1);
        myArrList.add(sb2);

        ArrayList<StringBuilder> yourArrList = myArrList;

        ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>) myArrList.clone();

        System.out.println(myArrList == yourArrList); // true
        System.out.println(myArrList == clonedArrList); // false

        StringBuilder myArrVal = myArrList.get(0); // Jan
        StringBuilder yourArrVal = yourArrList.get(0); //Jan
        StringBuilder clonedArrVal = clonedArrList.get(0); // Jan

        System.out.println(myArrVal == yourArrVal); // true
        System.out.println(myArrVal ==clonedArrVal); // true


        /*ArrayList<MyPerson> myArrList = new ArrayList<>();
        MyPerson p1 = new MyPerson("Shreya");
        MyPerson p2 = new MyPerson("Paul");

        myArrList.add(p1);
        myArrList.add(p2);
        myArrList.add(p2);

        System.out.println(myArrList.contains(new MyPerson("Shreya"))); // true
        System.out.println(myArrList.contains(p1)); // true

        System.out.println(myArrList.indexOf(new MyPerson("Paul"))); // 1
        System.out.println(myArrList.indexOf(p2)); // 1

        System.out.println(myArrList.lastIndexOf(new MyPerson("Paul"))); // 2
        System.out.println(myArrList.lastIndexOf(p2)); // 2
*/

    }

}
