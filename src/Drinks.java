public enum Drinks {
    COFFEE(16.99),
    TEA(11.99),
    LEMONADE(21.99),
    MOJITO(30.00),
    WATER(10.00),
    COLA(25.50);

    final double price;
    Drinks(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
