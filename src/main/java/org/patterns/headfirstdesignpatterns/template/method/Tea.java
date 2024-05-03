package org.patterns.headfirstdesignpatterns.template.method;

class Tea extends Beverage{

    @Override
    protected void addCondiments() {

    }

    @Override
    protected void brew() {
        System.out.println("Preparing a tea");
    }
}
