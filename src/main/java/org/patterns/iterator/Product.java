package org.patterns.iterator;

import java.math.BigDecimal;
import java.util.UUID;

class Product {

    private final String id;
    private final String name;
    private final BigDecimal price;
    private final Category category;

    Product(String name, BigDecimal price, Category category) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
