package DemoArrayList;

public class BankAccount {
    String accNumber;
    int accType;

    public boolean equals(Object obj){
        if(obj instanceof BankAccount){
            BankAccount b = (BankAccount) obj;

            return (b.accNumber.equals(this.accNumber) &&
                    b.accType == this.accType);
        } else {
            return false;
        }

    }




}
