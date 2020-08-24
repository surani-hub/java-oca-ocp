package DemoStringClass;

public class StringDemo {
    public static void main(String[] args) {
        String letters = "ABCAB";

        System.out.println(letters.charAt(0)); // A
        System.out.println(letters.indexOf('C')); //2
        System.out.println(letters.indexOf("CA")); //2
        System.out.println(letters.indexOf('B', 2)); // 4
        System.out.println(letters.indexOf("CA",1)); //2

        System.out.println(letters.substring(2)); // CAB
        System.out.println(letters.substring(2,4)); // CA

        System.out.println(letters); //    ABCAB
        System.out.println(letters.trim()); //ABCAB

        System.out.println(letters.replace('A', 'a')); // aBCaB
        System.out.println(letters.length()); //5

        System.out.println(letters.startsWith("A")); // true
        System.out.println(letters.startsWith("A",3)); // true


    }
}
