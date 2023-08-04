package com.workintehS18G5.burgers;

import com.workintehS18G5.burgers.enums.BreadRollType;
import com.workintehS18G5.burgers.enums.MeatCook;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;

    private double healthyExtra1Price;

    private String healthyExtra2Name;

    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, MeatCook.WELLDONE, price, breadRollType);
        setMeat("Tofu");
    }
    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public void itemizeHamburger() {
       super.itemizeHamburgerInitial();
        StringBuilder builder = new StringBuilder();
        if (healthyExtra1Name != null) {
            builder.append("HealthyAddition1: " + healthyExtra1Name+"\n");
        }
        if (healthyExtra2Name != null) {
            builder.append("HealthyAddition2: " + healthyExtra2Name+"\n");
        }
        System.out.println(builder);
        double healthyPrice = getPrice() + healthyExtra1Price + healthyExtra2Price;
        System.out.println( "Price: "+ healthyPrice+"\n");
        System.out.println( "**********************"+"\n");
    }
}
