package com.company;

public class Hamburger {
    String breadRollType;
    String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean pickles;

    static final int HAMBURGER_PRICE = 10;

    public Hamburger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public void additions(boolean lettuce, boolean tomato, boolean pickles) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickles = pickles;
    }

    int additionsPrice;
    int grandTotal;

    public void calculateHamburgerAdditions() {
        int lettuce = 2;
        int tomato = 2;
        int pickles = 3;
        additionsPrice = 0;
        grandTotal = HAMBURGER_PRICE;

        System.out.println("-----Additions-----");

        if (this.lettuce) {
            additionsPrice += lettuce;
            grandTotal += lettuce;
            System.out.println("#Lettuce Added: $" + lettuce);
        }

        if (this.tomato) {
            additionsPrice += tomato;
            grandTotal += tomato;
            System.out.println("#Tomato Added: $" + tomato);
        }

        if (this.pickles) {
            additionsPrice += pickles;
            grandTotal += pickles;
            System.out.println("#Pickles Added: $" + pickles);
        }
    }

    public void getReceipt() {
        System.out.println("**********HAMBURGER ORDER**********");
        System.out.println("-----Basics-----");
        System.out.println("#Bread Type: " + this.breadRollType);
        System.out.println("#Meat: " + this.meat);

        calculateHamburgerAdditions();

        System.out.println("-----Grand Total Price-----");
        System.out.println("##Hamburger Basic Price: $" + HAMBURGER_PRICE);
        System.out.println("##Additions Total Price: $" + additionsPrice);
        System.out.println("##Grand TOTAL: $" + grandTotal);
    }

}