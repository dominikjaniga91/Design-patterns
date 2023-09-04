package org.patterns.chainofresponsibility.refactoring.guru.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        Validator validator = Validator.link(
            new ThrottlingValidator(2),
            new UserExistsValidator(server),
            new RoleCheckValidator()
        );

        // Server gets a chain from client code.
        server.setMiddleware(validator);
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