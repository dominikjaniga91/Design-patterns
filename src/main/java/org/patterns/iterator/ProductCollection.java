package org.patterns.iterator;

interface ProductCollection<T> {

    void addProduct(T t);

    void removeProduct(T t);

    Iterator<T> iterator();
}
