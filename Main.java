import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HealthBurger healthBurger = new HealthBurger("beef", 100);
        healthBurger.pick("lettuce", "tomato");
        healthBurger.setAddition("cheese", "pickle", "onion");
        System.out.println("the total amount: $" +  healthBurger.details());
        System.out.println();
        DeluxeBurger deluxeBurger = new DeluxeBurger("White", "chicken", 150);
        System.out.println("the total amount: $" +  deluxeBurger.details());

    }
}
