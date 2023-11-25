package com.workintech.burger;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String name, String meat, String breadRollType) {
        super(name, meat, breadRollType, 19.10);
        super.addHamburgerAddition1("chips",0);
        super.addHamburgerAddition2("coke",0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You can not add any addition");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You can not add any addition");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You can not add any addition");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You can not add any addition");
    }

    @Override
    public void addHealthyAddition1(String name, double price) {
        System.out.println("You can not add any addition");
    }

    @Override
    public void addHealthyAddition2(String name, double price) {
        System.out.println("You can not add any addition");
    }

    @Override
    public void itemizeHamburger() {
        super.itemizeHamburger();
    }
}
