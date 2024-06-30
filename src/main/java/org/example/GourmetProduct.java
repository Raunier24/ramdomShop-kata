package org.example;

import java.math.BigDecimal;

public class GourmetProduct implements PriceCalculator {
    private final int age;
    private final boolean isStinky;

    public GourmetProduct(int age, boolean isStinky) {
        this.age = age;
        this.isStinky = isStinky;
    }

    public int getAge () {
        return age;
    }
    public boolean isStinky() {
        return isStinky;
    }

    @Override
    public BigDecimal calculatePrice(Product product) {
        BigDecimal basePrice;
        if (this.isStinky) {
            basePrice = BigDecimal.valueOf(10.0 * age);
        } else {
            basePrice = BigDecimal.valueOf(20.0 * age);
        }

        return basePrice;
    }

    @Override
    public BigDecimal calculatePrice(ShoppingCart.Product product) {
        return null;
    }
}
