package org.example;

import java.math.BigDecimal;

public class Product {
    private final Integer age;
    private final BigDecimal basePrice;
    private final String name;
    private final BigDecimal sellPrice;
    private final String type;
    private final Integer numberOfLegs;
    private final boolean isStinky;
    private final String color;


    public Product(Integer age, BigDecimal basePrice, String name, BigDecimal sellPrice, String type, Integer numberOfLegs, boolean isStinky, String color) {
        this.age = age;
        this.basePrice = basePrice;
        this.name = name;
        this.sellPrice = sellPrice;
        this.type = type;
        this.numberOfLegs = numberOfLegs;
        this.isStinky = isStinky;
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public String getType() {
        return type;
    }

    public Integer getNumberOfLegs() { return numberOfLegs; }

    public boolean isStinky() { return isStinky; }

    public String getColor() { return color; }
    }