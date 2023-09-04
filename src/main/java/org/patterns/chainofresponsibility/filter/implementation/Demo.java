package org.patterns.chainofresponsibility.filter.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Demo class. Everything comes together here.
 */
class Demo {
    private BufferedReader reader;
    private Server server;

    public Demo(BufferedReader reader, Server server) {
        this.reader = reader;
        this.server = server;
    }

    private void init() {
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        List<Validator> validators = List.of(new ThrottlingValidator(2),
                new UserExistsValidator(server),
                new RoleCheckValidator());
        ValidatorChain validatorChain = new ServerValidatorChain(validators);

        // Server gets a chain from client code.
        server.setMiddleware(validatorChain);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Server server = new Server();
        new Demo(reader, server).init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}