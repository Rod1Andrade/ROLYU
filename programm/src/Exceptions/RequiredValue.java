package Exceptions;

/**
 * Exceção de valor requirido.
 */
public class RequiredValue extends RuntimeException {

    public RequiredValue(String message) {
        super(message);
    }
}
