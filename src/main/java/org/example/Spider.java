package org.example;

import java.math.BigDecimal;

public class Spider extends Pet {
    private final Integer numberOfLegs;
    private boolean isStinky;
    private BigDecimal basePrice;

    public Spider(Integer numberOfLegs, boolean isStinky, BigDecimal basePrice) {
        super();
        this.numberOfLegs = numberOfLegs;
        this.isStinky = isStinky;
        this.basePrice = basePrice;

    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public BigDecimal calculatePrice(Product product) {
        BigDecimal price = basePrice.multiply(BigDecimal.valueOf(1.20 * numberOfLegs));

        if (product.getColor().equalsIgnoreCase("red")) {
            price = price.add(BigDecimal.valueOf(2));
        } else if (product.getColor().equalsIgnoreCase("gold")) {
            price = price.add(BigDecimal.valueOf(3));
        }

        if (isStinky) {
            price = price.divide(BigDecimal.valueOf(2));
        }

        return price;
    }
}
