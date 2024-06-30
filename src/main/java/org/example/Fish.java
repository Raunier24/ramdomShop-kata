package org.example;

import java.math.BigDecimal;

public class Fish extends Pet {
    private final String color;

    public Fish (String color) {
        super (color);
        this.color = color;
    }

    @Override
        public BigDecimal calculatePrice(Product product) {
                    BigDecimal basePrice = product.getBasePrice();

            return switch (color) {
                case "blue" -> basePrice.add(BigDecimal.valueOf(0.1));
                case "gold" -> basePrice.multiply(BigDecimal.valueOf(100.0));
                default -> basePrice;
            };
        }
    }
