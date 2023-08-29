package com.github.israiloff.broker.error;

/**
 * Indicates that get message process error occurred.
 */
public class GetMessageException extends Exception {
    public GetMessageException(Throwable cause) {
        super(cause);
    }
}
