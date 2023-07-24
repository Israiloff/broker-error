package uz.cbssolutions.broker.error;

/**
 * Indicates name of the topic cant be resolved.
 */
public class TopicNameResolveException extends Exception {
    public TopicNameResolveException(Throwable cause) {
        super(cause);
    }
}
