package ua.edu.ucu.lab.flower;

import lombok.Getter;


public class FlowerPack {
    @Getter
    private Flower flower;

    @Getter
    private int quantity;

    public FlowerPack(Flower fl) {
        this.flower = new Flower(fl);
        setQuantity(1);
    }

    public void setQuantity(int quant) {
        this.quantity = quant < 1 ? 1 : quant;
    }

    public double getPrice() {
        return getQuantity() * flower.getPrice();
    }
}



