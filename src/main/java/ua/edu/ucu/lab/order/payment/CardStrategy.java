package ua.edu.ucu.lab.order.payment;

public class CardStrategy implements PaymentStrategy {
    private static final double cardBalance = 1000;
    @Override
    public boolean pay(double price) {
        if (price <= cardBalance){
            return true;
        } else{
            return false;
        }
    }
}
