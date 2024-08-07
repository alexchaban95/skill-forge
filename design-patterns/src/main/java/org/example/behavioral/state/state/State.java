package org.example.behavioral.state.state;

import org.example.behavioral.state.VendingMachine;

public interface State {
    void insertCoin(VendingMachine vendingMachine);
    void dispenseDrink(VendingMachine vendingMachine);
}
