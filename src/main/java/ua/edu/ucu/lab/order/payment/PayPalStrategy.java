package ua.edu.ucu.lab.order.payment;

public class PayPalStrategy implements PaymentStrategy {
    private static final double walletBalance = 1000;
    @Override
    public boolean pay(double price) {
        if (price <= walletBalance){
            return true;
        } else{
            return false;
        }
    }
}
