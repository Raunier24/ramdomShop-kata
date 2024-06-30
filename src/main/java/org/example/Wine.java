package org.example;

import java.math.BigDecimal;

public class Wine extends GourmetProduct {
    public Wine(int age) {
        super(age, false);
    }

    @Override
    public BigDecimal calculatePrice(Product product) {
        BigDecimal basePrice = BigDecimal.valueOf(20.0 * getAge());
        return basePrice;
    }
}