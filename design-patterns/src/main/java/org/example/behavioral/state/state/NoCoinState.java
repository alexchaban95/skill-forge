package org.example.behavioral.state.state;

import org.example.behavioral.state.VendingMachine;

public class NoCoinState implements State {
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin inserted.");
        vendingMachine.setState(new CoinInsertedState());
    }

    @Override
    public void dispenseDrink(VendingMachine vendingMachine) {
        System.out.println("Insert coin first.");
    }
}
