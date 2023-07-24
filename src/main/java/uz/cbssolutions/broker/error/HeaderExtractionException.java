package uz.cbssolutions.broker.error;

/**
 * Indicates that header extraction process error occurred.
 */
public class HeaderExtractionException extends Exception {
    public HeaderExtractionException(Throwable cause) {
        super(cause);
    }
}
