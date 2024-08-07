package org.example.behavioral.state.state;

import org.example.behavioral.state.VendingMachine;

public class CoinInsertedState implements State {
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void dispenseDrink(VendingMachine vendingMachine) {
        System.out.println("Dispensing drink...");
        vendingMachine.setState(new NoCoinState());
    }
}
