package io.github.israiloff.broker.error;

/**
 * Error indicates that type of message is different from expected one.
 */
public class MessageTypeMismatchException extends Exception {

    /**
     * Constructor with parameter.
     *
     * @param msgClass Expected class of message.
     */
    public MessageTypeMismatchException(Class<?> msgClass) {
        super("Message must be of type '" + msgClass.getTypeName() + "'");
    }
}
