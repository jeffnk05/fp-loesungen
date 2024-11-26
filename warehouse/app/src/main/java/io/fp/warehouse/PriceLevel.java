package io.fp.warehouse;

public enum PriceLevel {
    LOW(9.99),
    MEDIUM(19.99),
    HIGH(49.99),
    EXCLUSIVE(99.99);

    private final double price;

    private PriceLevel(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    
    @Override
    public String toString() {
        return String.valueOf(price);
    }
    
}
