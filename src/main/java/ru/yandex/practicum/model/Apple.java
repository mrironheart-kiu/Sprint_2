package ru.yandex.practicum.model;

import static ru.yandex.practicum.model.constants.Colour.RED;
import static ru.yandex.practicum.model.constants.Discount.NO_DISCOUNT;
import static ru.yandex.practicum.model.constants.Discount.RED_APPLE_DISCOUNT;

public class Apple extends Food {

    private final String colour;

    public Apple(double price, int amount, String colour) {
        super.price = price;
        super.amount = amount;
        super.isVegetarian = true;
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (this.colour.equals(RED)) {
            return RED_APPLE_DISCOUNT;
        }
        return NO_DISCOUNT;
    }
}
