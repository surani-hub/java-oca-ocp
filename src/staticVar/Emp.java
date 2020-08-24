package staticVar;

class Emp {
    String name;
    static int bankVault;

    public static void main(String[] args) {
        Emp emp1 = new Emp();
        Emp emp2 = new Emp();

        System.out.println(bankVault);
        emp1.bankVault = 10;
        System.out.println(bankVault);
        emp2.bankVault =20;
        System.out.println(bankVault);

        System.out.println(Emp.bankVault);
    }

}
