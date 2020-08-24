package DemoArrays;

public class MulArray {
    public static void main(String[] args) {
        StringBuilder[] mulStrings = new StringBuilder[] {
                new StringBuilder("Java"),
                new StringBuilder("Loop")
            };

        for (StringBuilder vals:mulStrings){
            System.out.println(vals);
        }

        System.out.println("**********************************************************");

        for (StringBuilder vals:mulStrings){
            vals.append("Oracle");
        }

        for (StringBuilder vals: mulStrings){
            System.out.println(vals);
        }


















    }
}
