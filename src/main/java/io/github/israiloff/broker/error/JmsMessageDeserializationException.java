package io.github.israiloff.broker.error;

/**
 * Indicates that an incoming JMS message deserialization process failed.
 */
public class JmsMessageDeserializationException extends Exception {
    public JmsMessageDeserializationException(Throwable cause) {
        super("Incoming JMS message deserialization error", cause);
    }
}
