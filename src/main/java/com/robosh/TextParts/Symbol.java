package com.robosh.TextParts;

public class Symbol implements TextPart {
    private char symbol;

    public Symbol() {
    }

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
