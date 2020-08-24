package DemoArrayList;

import java.util.ArrayList;

public class TestBankAccountCreation {
    public static void main(String[] args) {
        BankAccountCreation b1 = new BankAccountCreation();
        b1.accType = 5;
        b1.accNumber ="12345";

        ArrayList<BankAccountCreation> list = new ArrayList<>();
        list.add(b1);

        BankAccountCreation b2 = new BankAccountCreation();
        b2.accNumber = "12345";
        b2.accType =5;

        System.out.println(list.contains(b2));

    }
}
