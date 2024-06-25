package org.example;

import java.math.BigDecimal;

public interface PriceCalculator {
    BigDecimal calculatePrice(Product product);

    class MagicCardPriceCalculator implements PriceCalculator {
        @Override
        public BigDecimal calculatePrice(Product product) {
            String color = product.getColor();
            int age = product.getAge() != null ? product.getAge() : 0;

            if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
                return BigDecimal.valueOf(40000.0);
            }

            BigDecimal basePrice = switch (color) {
                case "blue" -> BigDecimal.valueOf(5.0);
                case "red" -> BigDecimal.valueOf(3.5);
                case "green" -> BigDecimal.valueOf(4.4);
                case "black" -> BigDecimal.valueOf(6.8);
                default -> BigDecimal.valueOf(2.0);
            };

            if ((color.equals("blue") || color.equals("red")) && age > 10) {
                basePrice = basePrice.divide(BigDecimal.valueOf(2.0));
            } else if ((color.equals("black") || color.equals("green")) && age > 20) {
                basePrice = basePrice.multiply(BigDecimal.valueOf(1.2));
            }

            return basePrice;
        }
    }

    class PetPriceCalculator implements PriceCalculator {
        @Override
        public BigDecimal calculatePrice(Product product) {
            int legs = product.getNumberOfLegs();
            String color = product.getColor();
            boolean isStinky = product.isStinky();

            BigDecimal basePrice = BigDecimal.valueOf(1.20 * legs);

            if (color.equalsIgnoreCase("rojo")) {
                basePrice = basePrice.add(BigDecimal.valueOf(2));
            } else if (color.equalsIgnoreCase("dorado")) {
                basePrice = basePrice.add(BigDecimal.valueOf(3));
            }

            if (isStinky) {
                basePrice = basePrice.divide(BigDecimal.valueOf(2));
            }

            return basePrice;
        }
    }

    class GourmetProductPriceCalculator implements PriceCalculator {
        @Override
        public BigDecimal calculatePrice(Product product) {
            int age = product.getAge();
            boolean isStinky = product.isStinky();

            BigDecimal basePrice = isStinky ? BigDecimal.valueOf(10.0 * age) : BigDecimal.valueOf(20.0 * age);
            return basePrice;
        }
    }

    class FishPriceCalculator implements PriceCalculator {
        @Override
        public BigDecimal calculatePrice(Product product) {
            String color = product.getColor();
            BigDecimal basePrice = product.getBasePrice();

            return switch (color) {
                case "blue" -> basePrice.add(BigDecimal.valueOf(0.1));
                case "gold" -> basePrice.multiply(BigDecimal.valueOf(100.0));
                default -> basePrice;
            };
        }
    }
}
