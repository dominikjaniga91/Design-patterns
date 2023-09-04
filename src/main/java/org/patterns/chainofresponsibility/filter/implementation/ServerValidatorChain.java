package org.patterns.chainofresponsibility.filter.implementation;

import java.util.List;

/**
 * Base validator class.
 */
class ServerValidatorChain implements ValidatorChain {

    private final List<Validator> validators;
    private int currentPosition = 0;

    public ServerValidatorChain(List<Validator> validators) {
        this.validators = validators;
    }

    @Override
    public boolean validate(String email, String password) {
        System.out.println("ServerValidatorChain validate, number = " + currentPosition);

        if (currentPosition < validators.size()) {
            // Get the current filter and increment the position
            Validator currentFilter = validators.get(currentPosition);
            currentPosition++;

            // Call the current filter's doFilter method
            return currentFilter.validate(email, password, this);
        }
        return true;
    }
}