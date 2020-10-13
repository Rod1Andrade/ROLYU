package database.dao;


import java.sql.SQLException;
import java.util.List;

/**
 * Interface para a construão de classes DAO
 * Data Access Object
 *
 * @author Rodrigo Andrade
 */
public interface DataAccessObject<T> {

    /**
     * Cria tabela da entidade no banco.
     * @return True caso tenha conseguido criar
     * e falso caso contrario.
     */
    boolean createTable() throws SQLException;

    /**
     * Persiste uma entidade no banco.
     * @param entity Entidade a ser persistida
     * @return True caso tenha conseguido persistir
     * e falso caso contrario.
     */
    boolean persist(T entity);

    /**
     * Atualiza uma entidade no banco.
     * @param entity Entidade a ser atualizada
     * @return 1 em caso de linhas afetadas.
     */
    int update(T entity);

    /**
     * Retorna a entidade dado o seu id.
     * @param id Id da entidae
     * @return Entity caso encontre ou nulo caso nao encontre.
     */
    T getById(int id);

    /**
     * Retorna todas as ocorrencias da entidade no banco.
     * @return List<T> de tipo T da entidade.
     */
    List<T> getAll();

    /**
     * Remove uma entidade do banco de dados.
     * @param entity Entidade a ser removida.
     * @return 1 em caso de linhas afetadas.
     */
    int remove(T entity);
}
