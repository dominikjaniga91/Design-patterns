package org.patterns.iterator;

import java.util.List;

class Products implements ProductCollection<Product> {

    private final List<Product> products;

    public Products(List<Product> products) {
        this.products = products;
    }

    int size() {
        return products.size();
    }

    Product getProductByIndex(int index) {
        return products.get(index);
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator(this);
    }

    private static class ProductIterator implements Iterator<Product> {

        private final Products products;
        private int position;

        public ProductIterator(Products products) {
            this.products = products;
        }

        @Override
        public Product next() {
            return products.getProductByIndex(position++);
        }

        @Override
        public boolean hasNext() {
            return position < products.size();
        }
    }

    @Override
    public String toString() {
        return "Products{" +
                "products=" + products +
                '}';
    }
}
