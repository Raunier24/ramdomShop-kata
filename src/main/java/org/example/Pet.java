package org.example;

import java.math.BigDecimal;

public class Pet implements PriceCalculator {
    private final String color;

    public Pet(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public BigDecimal calculatePrice(Product product) {
        BigDecimal basePrice = product.getBasePrice().multiply(BigDecimal.valueOf(product.getNumberOfLegs()));

        if (product.getColor().equalsIgnoreCase("red")) {
            basePrice = basePrice.add(BigDecimal.valueOf(2));
        } else if (product.getColor().equalsIgnoreCase("gold")) {
            basePrice = basePrice.add(BigDecimal.valueOf(3));
        }

        if (product.isStinky()) {
            basePrice = basePrice.divide(BigDecimal.valueOf(2));
        }

        return basePrice;
    }

    @Override
    public BigDecimal calculatePrice(ShoppingCart.Product product) {
        return null;
    }
}
