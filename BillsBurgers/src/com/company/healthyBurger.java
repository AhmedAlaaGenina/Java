package com.company;

public class healthyBurger extends hamburgers {
    private int milk;
    private boolean dait;

    public healthyBurger(String meatType, int price, String name) {
        super("brown rye bread", meatType, price, name);
        this.dait = true;
        this.milk = 1;
    }


    public void price(int priceBurger, int additionPrice, int lettuce, int tomato, int carrot, int khas) {
        super.price(additionPrice, lettuce, tomato, carrot, khas);
    }

    public int getMilk() {
        return milk;
    }

    public boolean isDait() {
        return dait;
    }
}
