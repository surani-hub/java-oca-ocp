package DemoArrayList;

public class BankAccountCreation {
    String accNumber;
    int accType;

    public boolean equals(BankAccountCreation obj){
        if (obj != null){
            return ( accNumber.equals(obj.accNumber) &&
                    accType == obj.accType
                    );
        } else {
            return false;
        }
    }



    /*public boolean equals(Object obj){
        if(obj != null){
            BankAccountCreation b = (BankAccountCreation)obj;

            return (b.accNumber.equals(accNumber) &&
                    b.accType == accType);
        } else {
            return false;
        }

    }*/
}
