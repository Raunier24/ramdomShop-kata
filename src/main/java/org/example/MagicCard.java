package org.example;

import java.math.BigDecimal;

public class MagicCardPriceCalculator implements PriceCalculator {
    private static final BigDecimal BLACK_LOTUS_PRICE = BigDecimal.valueOf(40000.0);

    @Override
    public BigDecimal calculatePrice(Product product) {
        String color = product.getColor();
        int age = product.getAge() != null ? product.getAge() : 0;

        if ("Magic: The Gathering - Black Lotus".equals(product.getName())) {
            return BLACK_LOTUS_PRICE;
        }

        BigDecimal basePrice = getColorBasePrice(color);

        if (isDiscountApplicable(color, age)) {
            basePrice = applyDiscount(basePrice);
        } else if (isPremiumApplicable(color, age)) {
            basePrice = applyPremium(basePrice);
        }

        return basePrice;
    }

    private BigDecimal getColorBasePrice(String color) {
        return switch (color) {
            case "blue" -> BigDecimal.valueOf(5.0);
            case "red" -> BigDecimal.valueOf(3.5);
            case "green" -> BigDecimal.valueOf(4.4);
            case "black" -> BigDecimal.valueOf(6.8);
            default -> BigDecimal.valueOf(2.0);
        };
    }

    private boolean isDiscountApplicable(String color, int age) {
        return ("blue".equals(color) || "red".equals(color)) && age > 10;
    }

    private boolean isPremiumApplicable(String color, int age) {
        return ("black".equals(color) || "green".equals(color)) && age > 20;
    }

    private BigDecimal applyDiscount(BigDecimal basePrice) {
        return basePrice.divide(BigDecimal.valueOf(2.0));
    }

    private BigDecimal applyPremium(BigDecimal basePrice) {
        return basePrice.multiply(BigDecimal.valueOf(1.2));
    }
}