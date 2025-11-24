package ru.yandex.practicum.model.service;

import ru.yandex.practicum.model.Food;

import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<Food> shoppingCart;

    public ShoppingCart(ArrayList<Food> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    /**
     * Метод для получения общей суммы товаров в корзине без скидки
     */
    public double getFullPriceWithoutDiscount(){
        double fullPrice = 0.0;
        for (Food food : shoppingCart) {
            fullPrice += food.getPrice() * food.getAmount();
        }
        return fullPrice;
    }

    /**
     * Метод для получения общей суммы товаров в корзине со скидки
     */
    public double getFullPriceWithDiscount(){
        double fullPrice = 0.0;
        for (Food food : shoppingCart) {
            if (food.getDiscount() > 0) {
                fullPrice += (food.getPrice() * food.getAmount() / 100) * food.getDiscount();
            } else {
                fullPrice += (food.getPrice() * food.getAmount());
            }
        }
        return fullPrice;
    }

    /**
     * Метод для получения общей суммы всех вегетарианских продуктов в корзине без скидки
     */
    public double getVeganFullPriceWithoutDiscount(){
        double fullPrice = 0.0;
        for (Food food : shoppingCart) {
            if (food.isVegetarian()) {
                fullPrice += food.getPrice() * food.getAmount();
            }
        }
        return fullPrice;
    }
}
