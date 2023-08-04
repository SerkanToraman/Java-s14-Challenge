package com.workintehS18G5.burgers;

import com.workintehS18G5.burgers.enums.BreadRollType;
import com.workintehS18G5.burgers.enums.MeatCook;

public class DeluxeBurger extends Hamburger {

    private String drink;
    private String cips;

    public DeluxeBurger(MeatCook meatCook) {
        super("DeluxeBurger", meatCook, 19.1, BreadRollType.DOUBLE_BURGER);
        super.setMeat("double");
    }


    @Override
    public void addHamburgerAddition(String additionName, double price) {
        System.out.println("No addition option for Deluxe");
    }
}
