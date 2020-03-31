package com.company;

public class DeluxeBurger extends Hamburger {
    private boolean drinks;
    private boolean chips;

    public DeluxeBurger() {
        super("Long Large Seeded Bread", "Chopped Beef");
    }

    @Override
    public void additions(boolean lettuce, boolean tomato, boolean pickles) {
        super.additions(lettuce, tomato, pickles);
    }

    public void additions (boolean drinks, boolean chips) {
        super.additions (false, false, false);
        this.drinks = drinks;
        this.chips = chips;
    }

    @Override
    public void calculateHamburgerAdditions() {
        super.calculateHamburgerAdditions();
        int drinks = 4;
        int chips = 6;
        if (this.drinks) {
            additionsPrice += drinks;
            grandTotal += drinks;
            System.out.println("##Drinks Added: $" + drinks);
        }
        if (this.chips){
            additionsPrice +=chips;
            grandTotal +=chips;
            System.out.println("##Chips Added: $" + chips);
        }
    }

    public void getReceipt() {
        System.out.println("**********HAMBURGER ORDER**********");
        System.out.println("-----Deluxe Burger-----");
        System.out.println("#Bread Type: " + this.breadRollType);
        System.out.println("#Meat: " + this.meat);

        calculateHamburgerAdditions();

        System.out.println("-----Grand Total Price-----");
        System.out.println("##Hamburger Basic Price: $" + HAMBURGER_PRICE);
        System.out.println("##Additions Total Price: $" + additionsPrice);
        System.out.println("##Grand TOTAL: $" + grandTotal);
    }
}
