package ua.edu.ucu.lab.order.payment;

public class CardStrategy implements PaymentStrategy {
    private static final double Card_Balance = 1000;
    @Override
    public boolean pay(double price) {
        return price <= Card_Balance;
    }
}
