package Exceptions;

/**
 * Classe de exceção da entidade 'Stocks'.
 */
public class StocksException extends RuntimeException {
    
    public StocksException(String message) {
        super(message);
    }
}
