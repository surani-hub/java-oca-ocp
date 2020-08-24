package test;

import java.util.concurrent.RecursiveTask;

public class Rectangle {

    public int length= 15;
    int breadth;

    static int height=10;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

   public Rectangle() {

    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6,10);
        Rectangle r2 = new Rectangle(5,6);

        Car c = new Car();
       //  System.out.println(c.i);
        r1.height = 20;
        System.out.println(r1.length + " " + r1.breadth + " " + r1.height);

        System.out.println(r2.length + " " + r2.breadth + " " + r2.height);

    }
}

//6 10 10
//5 6 10

