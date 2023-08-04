package com.workintehS18G5;

import com.workintehS18G5.burgers.DeluxeBurger;
import com.workintehS18G5.burgers.Hamburger;
import com.workintehS18G5.burgers.HealthyBurger;
import com.workintehS18G5.burgers.enums.BreadRollType;
import com.workintehS18G5.burgers.enums.MeatCook;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger =new Hamburger("CheeseBurger", MeatCook.MEDIUM,14, BreadRollType.WHITEBREAD);
        hamburger.addHamburgerAddition("Mushroom",1);
        hamburger.addHamburgerAddition("Extra Cheese",4);
        hamburger.addHamburgerAddition("Extra Meat", 10);
        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 10, BreadRollType.TRUPHBURGER);
        healthyBurger.addHamburgerAddition("Mushroom",1);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        healthyBurger.itemizeHamburger();

        DeluxeBurger deluxeBurger = new DeluxeBurger(MeatCook.WELLDONE);
        deluxeBurger.addHamburgerAddition("Extra MEAT", 23);
        deluxeBurger.itemizeHamburger();

    }
}