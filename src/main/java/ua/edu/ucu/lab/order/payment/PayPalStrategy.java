package ua.edu.ucu.lab.order.payment;

public class PayPalStrategy implements PaymentStrategy {
    private static final double WALLET_BALANCE = 1000;
    @Override
    public boolean pay(double price) {
        return price <= WALLET_BALANCE;
    }
}
