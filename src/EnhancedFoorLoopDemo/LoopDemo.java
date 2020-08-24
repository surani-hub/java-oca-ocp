package EnhancedFoorLoopDemo;

public class LoopDemo {
    public static void main(String[] args) {
        StringBuilder[] myArr = {
                new StringBuilder("Java"),
                new StringBuilder("Oracle")
        };

        for (StringBuilder val:myArr){
            System.out.println(val);
        }

        for (StringBuilder val:myArr){
            val.append("Loop");
        }

        for (StringBuilder val:myArr){
            System.out.println(val);
        }
    }
}
