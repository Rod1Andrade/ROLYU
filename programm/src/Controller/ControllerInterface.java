package Controller;

/**
 * Interface de controlle padrao
 *
 * @author Rodrigo Andrade
 */
public interface ControllerInterface<DTO, Model> {

    /**
     * Persiste os dados
     *
     * @param dto - Data Transfer Object
     */
    void store(DTO dto);

}
