package ru.hse.game;

public class Cell {

    private boolean state;
    private boolean nextState;

    public Cell() {
        this.state = false;
        this.nextState = false;
    }

    public Cell(boolean state) {
        this.state = state;
        this.nextState = false;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isNextState() {
        return nextState;
    }

    public void setNextState(boolean nextState) {
        this.nextState = nextState;
    }

    public String print() {
        if (state) {
            return " X ";
        } else {
            return "   ";
        }
    }
}
