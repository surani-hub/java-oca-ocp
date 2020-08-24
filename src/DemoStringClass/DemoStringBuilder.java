package DemoStringClass;

public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("0123456789");

        System.out.println(sb.subSequence(2,4)); // 23

        System.out.println(sb); // 0123456789

        System.out.println(sb.substring(2,4)); // 23
        sb.reverse();

        System.out.println(sb);
        /*char[] name = {'J','a','v','a','8'};


        sb.insert(1,name,1,3);

        System.out.println(sb);    // 1ava23
        sb.insert(3,100);
        System.out.println(sb);    // 1av100a23

        sb.insert(2,name);
        System.out.println(sb);  // 1aJava8v100a23

        sb.deleteCharAt(1).insert(3,"Idiot"); // 1JaIdiotva8v100a23

        System.out.println(sb);*/


    }
}
