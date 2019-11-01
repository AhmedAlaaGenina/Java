package com.company;

public class deluxeBurger extends hamburgers {
    private int chips;
    private int drink;

    public deluxeBurger(String breadRollType, String meatType, int price, String name) {
        super(breadRollType, meatType, price, name);
        this.chips = 1;
        this.drink = 1;
    }


    public void price(int priceBurger) {
        super.price(0, 0, 0, 0, 0);
    }

    public int getChips() {
        return chips;
    }

    public int getDrink() {
        return drink;
    }
}
