package org.example.behavioral.state;

import org.example.behavioral.state.state.NoCoinState;
import org.example.behavioral.state.state.State;

public class VendingMachine {
    private State state;

    public VendingMachine() {
        state = new NoCoinState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void dispenseDrink() {
        state.dispenseDrink(this);
    }
}
