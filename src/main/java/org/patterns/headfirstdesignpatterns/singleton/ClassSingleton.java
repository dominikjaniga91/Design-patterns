package org.patterns.headfirstdesignpatterns.singleton;

class ClassSingleton {
    private static ClassSingleton instance;

    private ClassSingleton() {}

    public static ClassSingleton getInstance() {
        if (instance == null) {
            synchronized (ClassSingleton.class) {
                instance = new ClassSingleton();
            }
        }
        return instance;
    }
}
