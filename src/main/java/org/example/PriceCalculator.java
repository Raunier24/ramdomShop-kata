package org.example;

import java.math.BigDecimal;

public interface PriceCalculator {
    BigDecimal calculatePrice(Product product);

    BigDecimal calculatePrice(ShoppingCart.Product product);
}
