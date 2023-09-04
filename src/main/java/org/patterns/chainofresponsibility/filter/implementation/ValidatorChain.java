package org.patterns.chainofresponsibility.filter.implementation;

/**
 * Base validator class.
 */
interface ValidatorChain {


    /**
     * Subclasses will implement this method with concrete checks.
     */
    boolean validate(String email, String password);

}