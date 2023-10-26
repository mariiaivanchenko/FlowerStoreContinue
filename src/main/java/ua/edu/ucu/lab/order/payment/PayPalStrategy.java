package ua.edu.ucu.lab.order.payment;

public class PayPalStrategy implements PaymentStrategy {
    private static final double Wallet_Balance = 1000;
    @Override
    public boolean pay(double price) {
        return price <= Wallet_Balance;
    }
}
