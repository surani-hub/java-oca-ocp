package DemoArrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        list.add("one");
        list.add("two");

        list.add("four");
        list.add("Five");
        list.add("Six");
        list.add(2,"three");

        System.out.println(list);

        /*for(String ele:list){
            System.out.println(ele);
        }*/


        ListIterator iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.set(1,"one and Half");
        System.out.println(list);
    }
}
