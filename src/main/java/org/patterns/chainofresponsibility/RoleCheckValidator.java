package org.patterns.chainofresponsibility;

/**
 * ConcreteHandler. Checks a user's role.
 */
class RoleCheckValidator extends Validator {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}