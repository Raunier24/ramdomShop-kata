package org.example;

import java.math.BigDecimal;

public class Cheese extends GourmetProduct {
    private boolean isStinky;

    public Cheese(int age, boolean isStinky) {
        super(age, isStinky);
        this.isStinky = isStinky;
    }

    public boolean isStinky() {
        return isStinky;
    }

    public void setStinky(boolean stinky) {
        isStinky = stinky;

    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public BigDecimal calculatePrice(Product product) {
        return super.calculatePrice(product);
    }
}
