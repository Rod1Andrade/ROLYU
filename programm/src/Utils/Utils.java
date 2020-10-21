package Utils;

import Exceptions.RequiredValue;

/**
 * Classe utilitaria
 */
public class Utils {

    /**
     * Verifica se um objeto passado como argumento esta
     * vazio.
     * Caso esteja lanca uma excesão de 'RequiredValue'
     * @param value
     * @throws Exceptions.RequiredValue
     */
    public static void isRequired(Object value) {
        // TODO: Melhoria na verificacao.
        if(value == null)
            throw new RequiredValue("Campo Obrigatorio");
    }

}
