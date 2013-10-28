/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author usr14
 */
public interface OperacoesDAO {
    
    /**
     *
     * @param obj
     * @throws SQLException
     */
    void inserir (Object obj) throws SQLException;
    
    /**
     *
     * @param obj
     * @return
     * @throws SQLException
     */
    boolean excluir (Object obj) throws SQLException;
    
    /**
     *
     * @param obj
     * @throws SQLException
     */
    void editar (Object obj) throws SQLException;
    
    /**
     *
     * @return
     * @throws SQLException
     */
    ArrayList pesquisar() throws SQLException; //Pesquisar tudo
    
}
