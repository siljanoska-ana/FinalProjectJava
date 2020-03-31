package com.company;

public class HealthyBurger extends Hamburger {
    private boolean soySouse;
    private String breadRollType = "Brown rye bread";
    private String meat = "Soy meat";

    private static final int HEALTHY_ADDITION = 5;
    private static final int HEALTHY_BURGER = HAMBURGER_PRICE + HEALTHY_ADDITION;

    public HealthyBurger() {
        super("Brown rye bread", "Soy meet");
    }

    @Override
    public void additions(boolean lettuce, boolean tomato, boolean pickles) {
        super.additions(lettuce, tomato, pickles);
    }

    public void additions (boolean lettuce, boolean tomato, boolean pickles, boolean soySouse) {
        super.additions(lettuce, tomato, pickles);
        this.soySouse = soySouse;
    }

    @Override
    public void calculateHamburgerAdditions() {
        super.calculateHamburgerAdditions();
        int soySouse = 5;
        if (this.soySouse) {
            additionsPrice += soySouse;
            grandTotal += soySouse + HEALTHY_ADDITION;
            System.out.println("##Soy Souse Added = $" + soySouse);
        }
    }

     public void getReceiptHealthy() {
        System.out.println("**********HAMBURGER ORDER**********");
        System.out.println("-----Healthy Burger-----");
        System.out.println("#Bread Type: " + this.breadRollType);
        System.out.println("#Meat: " + this.meat);

        calculateHamburgerAdditions();

        System.out.println("-----Grand Total Price-----");
        System.out.println("##Healthy burger Price: $" + HEALTHY_BURGER);
        System.out.println("##Additions Total Price: $" + additionsPrice);
        System.out.println("##Grand TOTAL: $" + grandTotal);
    }
}
