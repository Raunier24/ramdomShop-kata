package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private final List<Product> products = new ArrayList<>();
    private final Map<String, PriceCalculator> priceCalculators = new HashMap<>();

    public ShoppingCart() {
        priceCalculators.put("Magic: The Gathering", new MagicCardPriceCalculator());
        priceCalculators.put("Pet", new PetPriceCalculator());
        priceCalculators.put("Gourmet", new GourmetProductPriceCalculator());
        priceCalculators.put("Fish", new FishPriceCalculator());
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public BigDecimal getTotalPrice() {
        return products.stream()
                .map(this::calculatePrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calculatePrice(Product product) {
        String productName = product.getName();
        String productType = product.getType();

        if (productName.contains("Magic: The Gathering") && priceCalculators.containsKey("Magic: The Gathering")) {
            return priceCalculators.get("Magic: The Gathering").calculatePrice(product);
        } else if (productType != null && priceCalculators.containsKey(productType)) {
            return priceCalculators.get(productType).calculatePrice(product);
        } else {
            return product.getSellPrice();
        }
    }

    class MagicCardPriceCalculator implements PriceCalculator {
        @Override
        public BigDecimal calculatePrice(org.example.Product product) {
            return null;
        }

        @Override
        public BigDecimal calculatePrice(Product product) {
            // Implement the logic for calculating the price of Magic Card products
            return BigDecimal.ZERO; // Replace with actual implementation
        }
    }

    class PetPriceCalculator implements PriceCalculator {
        @Override
        public BigDecimal calculatePrice(org.example.Product product) {
            return null;
        }

        @Override
        public BigDecimal calculatePrice(Product product) {
            // Implement the logic for calculating the price of Pet products
            return BigDecimal.ZERO; // Replace with actual implementation
        }
    }

    class GourmetProductPriceCalculator implements PriceCalculator {
        @Override
        public BigDecimal calculatePrice(org.example.Product product) {
            return null;
        }

        @Override
        public BigDecimal calculatePrice(Product product) {
            // Implement the logic for calculating the price of Gourmet products
            return BigDecimal.ZERO; // Replace with actual implementation
        }
    }

    class FishPriceCalculator implements PriceCalculator {
        @Override
        public BigDecimal calculatePrice(org.example.Product product) {
            return null;
        }

        @Override
        public BigDecimal calculatePrice(Product product) {
            // Implement the logic for calculating the price of Fish products
            return BigDecimal.ZERO; // Replace with actual implementation
        }
    }

    class Product {
        private String name;
        private String type;
        private BigDecimal sellPrice;

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public BigDecimal getSellPrice() {
            return sellPrice;
        }

        public int getAge() {
            return 0;
        }

        public String getColor() {
            return "";
        }
    }
}
