package org.patterns.chainofresponsibility.filter.implementation;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
class UserExistsValidator implements Validator {
    private Server server;

    public UserExistsValidator(Server server) {
        this.server = server;
    }

    public boolean validate(String email, String password, ValidatorChain validator) {
        System.out.println("UserExistsValidator validate");
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return validator.validate(email, password);
    }
}