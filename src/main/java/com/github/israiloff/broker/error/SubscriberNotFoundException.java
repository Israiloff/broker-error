package com.github.israiloff.broker.error;

/**
 * Error which indicates that subscriber's implementations are not exist.
 */
public class SubscriberNotFoundException extends Exception {

    /**
     * Default constructor.
     */
    public SubscriberNotFoundException() {
        super("Subscriptions are missing (or not implemented)");
    }
}
