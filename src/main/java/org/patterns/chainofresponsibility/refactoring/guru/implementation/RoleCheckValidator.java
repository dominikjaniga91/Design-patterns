package org.patterns.chainofresponsibility.refactoring.guru.implementation;

/**
 * ConcreteHandler. Checks a user's role.
 */
class RoleCheckValidator extends Validator {
    public boolean check(String email, String password) {
        System.out.println("RoleCheckValidator check");
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}