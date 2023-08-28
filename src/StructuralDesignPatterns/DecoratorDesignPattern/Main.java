package StructuralDesignPatterns.DecoratorDesignPattern;

import StructuralDesignPatterns.DecoratorDesignPattern.Pizza.BasePizza;
import StructuralDesignPatterns.DecoratorDesignPattern.Pizza.FarmHousePizza;
import StructuralDesignPatterns.DecoratorDesignPattern.Topping.ExtraCheese;
import StructuralDesignPatterns.DecoratorDesignPattern.Topping.Mushroom;

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
