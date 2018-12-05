package icu.cyclone.alex;

import java.util.Objects;

public class SymbolQuantity {
    private char symbol;
    private int quantity;

    public SymbolQuantity(char symbol) {
        this.symbol = symbol;
        this.quantity = 0;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void up() {
        quantity++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SymbolQuantity that = (SymbolQuantity) o;
        return symbol == that.getSymbol();
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }
}
