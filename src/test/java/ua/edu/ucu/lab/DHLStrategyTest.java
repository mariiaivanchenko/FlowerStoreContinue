package ua.edu.ucu.lab;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import ua.edu.ucu.lab.flower.Flower;
import ua.edu.ucu.lab.flower.FlowerBucket;
import ua.edu.ucu.lab.flower.FlowerColor;
import ua.edu.ucu.lab.flower.FlowerPack;
import ua.edu.ucu.lab.flower.FlowerType;
import ua.edu.ucu.lab.order.Order;
import ua.edu.ucu.lab.order.delivery.DeliveryType;
import ua.edu.ucu.lab.order.payment.PaymentType;

public class DHLStrategyTest {

    private Order ord = new Order();
    private Flower fl = new Flower(
        10, 15, FlowerColor.BLUE, FlowerType.CHAMOMILE);
    private FlowerPack flPack = new FlowerPack(fl);
    private FlowerBucket bucket = new FlowerBucket();

    @BeforeEach
    public void init() {
        for (int i = 0; i < 3; i++) {
            bucket.addFlowerPack(flPack);
        }
        
        ord.addItem(bucket);
        ord.setPaymentStrategy(PaymentType.CARD);
        ord.setDeliveryStrategy(DeliveryType.DHL);
    }

    @Test
    public void processOrder() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ord.processOrder();
        String printedText = outputStream.toString();

        System.setOut(System.out);
        assertTrue(printedText.contains("Order proccessed!"));
    }
}
