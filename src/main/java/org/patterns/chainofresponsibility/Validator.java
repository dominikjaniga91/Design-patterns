package org.patterns.chainofresponsibility;

/**
 * Base validator class.
 */
abstract class Validator {

    private Validator next;

    /**
     * Builds chains of validator objects.
     */
    public static Validator link(Validator first, Validator... chain) {
        Validator head = first;
        for (Validator nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * Subclasses will implement this method with concrete checks.
     */
    protected abstract boolean check(String email, String password);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}