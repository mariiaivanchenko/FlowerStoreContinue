package ua.edu.ucu.lab.order.payment;

public class PayPalStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        return price <= 1000 ? true : false;
    }
}
