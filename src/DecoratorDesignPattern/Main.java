package DecoratorDesignPattern;

import DecoratorDesignPattern.Pizza.BasePizza;
import DecoratorDesignPattern.Pizza.FarmHousePizza;
import DecoratorDesignPattern.Pizza.VegDelightPizza;
import DecoratorDesignPattern.Topping.ExtraCheese;
import DecoratorDesignPattern.Topping.Mushroom;

public class Main {

    public static void main(String args[]){

        BasePizza farmHousePizza = new FarmHousePizza();
        System.out.println(farmHousePizza.cost());

        BasePizza basePizzaWithExtraCheese = new ExtraCheese(farmHousePizza);
        System.out.println(basePizzaWithExtraCheese.cost());

        BasePizza basePizzaWithExtraCheeseAndMushRoom = new Mushroom(basePizzaWithExtraCheese);
        System.out.println(basePizzaWithExtraCheeseAndMushRoom.cost());


    }

}
