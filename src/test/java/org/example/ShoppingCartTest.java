package org.example;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null, "Magic: The Gathering");
        shoppingCart.addProduct(product);
        assertEquals(3.5, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Maga Eternal", null, "Magic: The Gathering");
        shoppingCart.addProduct(product);
        assertEquals(4.4, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null, "Magic: The Gathering");
        shoppingCart.addProduct(product);
        assertEquals(5.0, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Maga Eternal", null, "Magic: The Gathering");
        shoppingCart.addProduct(product);
        assertEquals(6.8, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForMagicCards_brown() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Maga Eternal", null, "Magic: The Gathering");
        shoppingCart.addProduct(product);
        assertEquals(2.0, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForMagicCards_blackLotus() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "blackLotus", null, "Magic: The Gathering - Black Lotus", null, "Magic: The Gathering");
        shoppingCart.addProduct(product);
        assertEquals(40000.0, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForMagicCards_redOver10Years() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 15, false, "red", null, "Magic: The Gathering - Lightning Bolt", null, "Magic: The Gathering");
        shoppingCart.addProduct(product);
        assertEquals(1.75, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForMagicCards_greenOver20Years() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 25, false, "green", null, "Magic: The Gathering - Maga Eternal", null, "Magic: The Gathering");
        shoppingCart.addProduct(product);
        assertEquals(5.28, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForFish_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "blue", BigDecimal.valueOf(0.0), "fish", null, "fish");
        shoppingCart.addProduct(product);
        assertEquals(0.1, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForFish_gold() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "gold", BigDecimal.valueOf(1.0), "gold Fish", null, "fish");
        shoppingCart.addProduct(product);
        assertEquals(100.0, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null, "gourmet");
        shoppingCart.addProduct(product);
        assertEquals(100.0, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 5, true, null, null, "French Camembert", null, "gourmet");
        shoppingCart.addProduct(product);
        assertEquals(50.0, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForPetWithLegs() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(4, null, false, "brown", null, "dog", null, "pet");
        shoppingCart.addProduct(product);
        assertEquals(4.8, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForRedSpider() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(8, null, false, "rojo", null, "spider", null, "pet");
        shoppingCart.addProduct(product);
        assertEquals(11.6, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForGoldSpider() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(8, null, false, "dorado", null, "spider", null, "pet");
        shoppingCart.addProduct(product);
        assertEquals(12.6, shoppingCart.getTotalPrice());
    }

    @Test
    void calculatePriceForStinkySpider() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(8, null, true, "brown", null, "spider", null, "pet");
        shoppingCart.addProduct(product);
        assertEquals(4.8, shoppingCart.getTotalPrice());
    }
}
