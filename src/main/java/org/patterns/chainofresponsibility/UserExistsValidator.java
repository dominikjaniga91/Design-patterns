package org.patterns.chainofresponsibility;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
class UserExistsValidator extends Validator {
    private Server server;

    public UserExistsValidator(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}