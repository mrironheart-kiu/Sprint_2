package ru.yandex.practicum.model;

import static ru.yandex.practicum.model.constants.Discount.NO_DISCOUNT;

public abstract class Food implements Discountable{

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public double getDiscount() {
        return NO_DISCOUNT;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
