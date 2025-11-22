package ru.yandex.practicum;

import ru.yandex.practicum.model.Apple;
import ru.yandex.practicum.model.Food;
import ru.yandex.practicum.model.Meat;
import ru.yandex.practicum.model.service.ShoppingCart;

import java.util.ArrayList;

import static ru.yandex.practicum.model.constants.Colour.GREEN;
import static ru.yandex.practicum.model.constants.Colour.RED;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(100.00,5);
        Apple applesRed = new Apple(50.00, 10, RED);
        Apple applesGreen = new Apple(60.00, 8, GREEN);

        ArrayList<Food> foodArray = new ArrayList<>();
        foodArray.add(meat);
        foodArray.add(applesRed);
        foodArray.add(applesGreen);

        ShoppingCart shoppingCart = new ShoppingCart(foodArray);

        System.out.println("Общая сумма товаров в корзине без скидки: " + shoppingCart.getFullPriceWithoutDiscount());
        System.out.println("Общая сумма товаров в корзине со скидкой: " + shoppingCart.getFullPriceWithDiscount());
        System.out.println("Cумма всех вегетарианских продуктов в корзине без скидки: " + shoppingCart.getVeganFullPriceWithoutDiscount());

    }
}
