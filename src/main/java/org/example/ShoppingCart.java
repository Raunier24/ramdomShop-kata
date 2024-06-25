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
        priceCalculators.put("Magic: The Gathering", new PriceCalculator.MagicCardPriceCalculator());
        priceCalculators.put("pet", new PriceCalculator.PetPriceCalculator());
        priceCalculators.put("gourmet", new PriceCalculator.GourmetProductPriceCalculator());
        priceCalculators.put("fish", new PriceCalculator.FishPriceCalculator());
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double getTotalPrice() {
        return products.stream()
                .map(this::calculatePrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }

    private BigDecimal calculatePrice(Product product) {
        if (product.getName().contains("Magic: The Gathering")) {
            return priceCalculators.get("Magic: The Gathering").calculatePrice(product);
        } else if (product.getType() != null) {
            return priceCalculators.get(product.getType()).calculatePrice(product);
        } else {
            return product.getSellPrice();
        }
    }
}