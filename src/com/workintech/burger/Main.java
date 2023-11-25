package com.workintech.burger;

public class Main {
    public static void main(String[] args) {

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", "double", "Sandwich",30);

        healthyBurger.addHamburgerAddition1("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger("Delice","duble","wrap");

        db.addHamburgerAddition3("Should not do this", 50.53);

        db.itemizeHamburger();


    }
}