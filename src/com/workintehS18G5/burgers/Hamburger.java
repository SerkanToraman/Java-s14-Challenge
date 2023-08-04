package com.workintehS18G5.burgers;

import com.workintehS18G5.burgers.enums.BreadRollType;
import com.workintehS18G5.burgers.enums.MeatCook;

public class Hamburger implements Addable {
    private String name;
    private String meat;
    private MeatCook meatCook;
    private double price;
    private BreadRollType breadRollType;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String name, MeatCook meatCook, double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat = "Single";
        this.price = price;
        this.breadRollType = breadRollType;
        this.meatCook=meatCook;
    }

    public String getName() {
        return name;
    }

    public MeatCook getMeatCook() {
        return meatCook;
    }

    public double getPrice() {
        return price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    @Override
    public void addHamburgerAddition(String additionName, double price) {
        if(addition1==null){
            this.addition1 = new Addition(additionName,price);
        }else if(addition2==null){
            this.addition2 = new Addition(additionName,price);
        }else if(addition3==null){
            this.addition3 = new Addition(additionName,price);
        }else if(addition4==null) {
            this.addition4 = new Addition(additionName, price);
        }else{
            System.out.println("Too much addition");
        }
    }
    public void itemizeHamburgerInitial(){
        StringBuilder builder = new StringBuilder();
        builder.append("**********************"+"\n");
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("MeatCook: " + meatCook + "\n");
        builder.append("BreadRollType: " + breadRollType + "\n");

        if (addition1 != null) {
            builder.append("Addition1: " + addition1.getAdditionName()+"\n");
            price = price + addition1.getAdditionPrice();
        }
        if (addition2 != null) {
            builder.append("Addition2: " + addition2.getAdditionName()+"\n");
            price = price + addition2.getAdditionPrice();
        }
        if (addition3 != null) {
            builder.append("Addition3: " + addition3.getAdditionName()+"\n");
            price = price + addition3.getAdditionPrice();
        }
        if (addition4 != null) {
            builder.append("Addition4: " + addition4.getAdditionName()+"\n");
            price = price + addition4.getAdditionPrice();
        }
        System.out.println(builder);
    };
    public void itemizeHamburger(){
        itemizeHamburgerInitial();
        System.out.println( "Price: "+ getPrice()+"\n");
        System.out.println( "**********************"+"\n");
    }
}
