package DTO;

/**
 * DTO Interface
 */
public interface DataTransferObject<T> {

    /**
     * Adapta um objeto DTO em um dado da interface
     *
     * @param dto - DTO que vai ser adptado
     * @return T - Valor adptado.
     */
    T adapter(DataTransferObject dto);

}
