package org.patterns.chainofresponsibility.filter.implementation;

/**
 * Base validator class.
 */
interface Validator {


    /**
     * Subclasses will implement this method with concrete checks.
     */
    boolean validate(String email, String password, ValidatorChain validator);

//    /**
//     * Runs check on the next object in chain or ends traversing if we're in
//     * last object in chain.
//     */
//    default boolean checkNext(String email, String password) {
//        if (next == null) {
//            return true;
//        }
//        return next.check(email, password);
//    }
}