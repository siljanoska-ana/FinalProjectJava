package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger basicHamburger = new Hamburger("Circle Roll", "Beef");
        basicHamburger.additions(true, true, true);
        basicHamburger.getReceipt();

        System.out.println("");

        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.additions(true, true, true, true);
        healthyBurger.getReceiptHealthy();

        System.out.println("");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.additions(true, true);
        deluxeBurger.getReceipt();
    }
}
