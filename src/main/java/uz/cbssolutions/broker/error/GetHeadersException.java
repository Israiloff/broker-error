package uz.cbssolutions.broker.error;

/**
 * Indicates that get headers process error occurred.
 */
public class GetHeadersException extends Exception {
    public GetHeadersException(Throwable cause) {
        super(cause);
    }
}
