package com.company;

public class hamburgers {
    private String breadRollType;
    private String meatType;
    private int lettuce;
    private int tomato;
    private int carrot;
    private int khas;
    private int price;
    private String name;

    public hamburgers(String breadRollType, String meatType, int price, String name) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.price = price;
        this.name = name;
        this.carrot = 0;
        this.khas = 0;
        this.tomato = 0;
        this.lettuce = 0;
    }

    public void price( int additionPrice, int lettuce, int tomato, int carrot, int khas) {
        int priceBurger=this.price;
        int priceAdd = (lettuce + tomato + carrot + khas) * additionPrice;
        int total = priceBurger + priceAdd;
        System.out.println("the Price OF Hamburger is " + price + "\n" +
                "the Price OF Additions is " + priceAdd + "\n" +
                "the Total is " +total);

    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCarrot() {
        return carrot;
    }

    public int getKhas() {
        return khas;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
