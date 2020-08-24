package DemoArrays;

import java.util.ArrayList;

public class ModifyArrayListElements {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();

        list.add(new StringBuilder("One"));
        list.add(new StringBuilder("Two"));
        list.add(new StringBuilder("Three"));

        for (StringBuilder ele:list){
            ele.append(ele.length());
        }

        for (StringBuilder ele: list){
            System.out.println(ele);
        }
        System.out.println("*****************************************************");
        list.remove(1);
        for (StringBuilder ele: list){
            System.out.println(ele);
        }

        System.out.println("**************************************************************");
        list.remove(new StringBuilder("One"));

        for (StringBuilder ele:list){
            System.out.println(ele);
        }
    }
}
