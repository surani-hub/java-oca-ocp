package book;

import cert.Sludge;
import test.Car;


public class Goo extends Car {
    public static void main(String[] args) {
        Sludge s = new Sludge();
        s.testIt();

        //Car c = new Car();


    }

    public void getGoo(){
        System.out.println(printResult());
    }
}
