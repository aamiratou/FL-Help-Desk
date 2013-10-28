/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import database.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.PropertiesManager;

/**
 *
 * @author Luiz
 */
public class FL_UsuarioDAO implements OperacoesDAO{

    private Connection conexao;

    /**
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public FL_UsuarioDAO() throws ClassNotFoundException, SQLException {
         conexao = DBConnection.getConnection(); 
    }
    
    /**
     *
     * @param obj
     */
    @Override
    public void inserir(Object obj) {
        String SQL = buscaSQL("insert.Usuario");
        if (obj instanceof FL_Usuario) {
            FL_Usuario user = (FL_Usuario) obj;
            /*PreparedStatement st = conexao.prepareStatement(SQL);
            st.setString(1, user.getCpf());
            st.setString(2, user.getNome());
            st.setString(3, user.getLogin());
            st.setString(4, user.getSenha());
            st.setInt(5, user.getTipo());
            st.execute();*/
        }
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param obj
     */
    @Override
    public void editar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private String buscaSQL(String chave) {
        String sql = null;
        try {
            PropertiesManager pm = new PropertiesManager("sql.properties");
            HashMap dados = pm.readPropertiesFile();
            sql = (String) dados.get(chave);
        } catch (IOException ex) {
            Logger.getLogger(FL_UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sql;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public ArrayList pesquisar() throws SQLException {
        ArrayList retorno = new ArrayList();
        String SQL = buscaSQL("selectAll.Usuario");
        Statement st = conexao.createStatement();
        ResultSet res = st.executeQuery(SQL);
        while (res.next()) {
            int id_usuario = res.getInt("id_usuario");
            String login = res.getString("login");           
            String senha = res.getString("senha");
            String email = res.getString("email");
            String nome = res.getString("nome");
            int id_categoria_usu = res.getInt("id_categoria_usu");
            int id_cliente = res.getInt("id_cliente");
            FL_Usuario user = new FL_Usuario(id_usuario, login, senha, email, nome, id_categoria_usu, id_cliente);
            retorno.add(user);
        }
        return retorno;
    }
    
    /**
     *
     * @param chave
     * @return
     * @throws SQLException
     */
    public FL_Usuario pesquisarLogin(String chave) throws SQLException {
        FL_Usuario user = null;
        String SQL = buscaSQL("selectByLogin.Usuario");
        PreparedStatement st = conexao.prepareStatement(SQL);
        st.setString(1, chave);
        ResultSet res = st.executeQuery();
        while (res.next()) {
            int id_usuario = res.getInt("id_usuario");
            String login = res.getString("login");           
            String senha = res.getString("senha");
            String email = res.getString("email");
            String nome = res.getString("nome");
            int id_categoria_usu = res.getInt("id_categoria_usu");
            int id_cliente = res.getInt("id_cliente");
            user = new FL_Usuario(id_usuario, login, senha, email, nome, id_categoria_usu, id_cliente);
        }
        return user;
    }
}
