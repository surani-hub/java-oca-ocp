package FoodMela;

import food.Fruit;

public class Apple extends Fruit {
    @Override
    public void getShape() {
        System.out.println("Round shape");
    }

    @Override
    public void isTasty() {
        System.out.println("Yes, too yummy");

    }
}
