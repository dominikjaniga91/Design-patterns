package org.patterns.chainofresponsibility.filter.implementation;

import java.util.HashMap;
import java.util.Map;

/**
 * Server class.
 */
class Server {
    private Map<String, String> users = new HashMap<>();
    private ValidatorChain validatorChain;

    /**
     * Client passes a chain of object to server. This improves flexibility and
     * makes testing the server class easier.
     */
    public void setMiddleware(ValidatorChain validatorChain) {
        System.out.println("Server setMiddleware " + validatorChain.getClass().getSimpleName());
        this.validatorChain = validatorChain;
    }

    /**
     * Server gets email and password from client and sends the authorization
     * request to the chain.
     */
    public boolean logIn(String email, String password) {
        if (validatorChain.validate(email, password)) {
            System.out.println("Authorization have been successful!");

            // Do something useful here for authorized users.

            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}