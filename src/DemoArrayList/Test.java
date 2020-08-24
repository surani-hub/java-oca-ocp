package DemoArrayList;

public class Test {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.accType = 4;
        b1.accNumber = "123456";

        BankAccount b2 = new BankAccount();
        b2.accNumber = "654321";
        b2.accType = 6;

        BankAccount b3 = new BankAccount();
        b3.accType = 6;
        b3.accNumber = "654321";

        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b3));
        System.out.println(b1.equals(new String("abc")));
    }
}
