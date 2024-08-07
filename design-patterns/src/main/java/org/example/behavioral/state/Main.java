package org.example.behavioral.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();
        vendingMachine.dispenseDrink();

        vendingMachine.insertCoin();
        vendingMachine.dispenseDrink();
    }
}
