package org.patterns.chainofresponsibility.filter.implementation;

/**
 * ConcreteHandler. Checks a user's role.
 */
class RoleCheckValidator implements Validator {

    public boolean validate(String email, String password, ValidatorChain chain) {
        System.out.println("RoleCheckValidator validate");
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return chain.validate(email, password);
    }
}