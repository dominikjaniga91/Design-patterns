package org.patterns.iterator;

import java.math.BigDecimal;
import java.util.ArrayList;

class Demo {
    public static void main(String[] args) {

        Products products = new Products(new ArrayList<>());
        products.addProduct(new Product("hat", new BigDecimal("13.56"), Category.HATS));
        products.addProduct(new Product("trousers", new BigDecimal("25.16"), Category.CLOTHES));
        products.addProduct(new Product("sneakers", new BigDecimal("13.56"), Category.SHOES));
        products.addProduct(new Product("asics", new BigDecimal("13.56"), Category.SHOES));

        Iterator<Product> productIterator = products.iterator();

        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            System.out.println(product);
        }
    }
}
