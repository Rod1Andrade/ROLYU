package Controller;

import java.util.Map;

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

    /**
     * Adapta uma HashMap para DTO e chama o metodo store.
     *
     * @param values Map<String, Object>
     */
    void adpaterToStore(Map<String, Object> values);

}
