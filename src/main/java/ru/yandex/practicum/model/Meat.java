package ru.yandex.practicum.model;

public class Meat extends Food {

    public Meat(double price, int amount) {
        super.price = price;
        super.amount = amount;
        super.isVegetarian = false;
    }
}
