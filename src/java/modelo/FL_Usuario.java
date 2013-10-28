/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Luiz
 */
public class FL_Usuario {
    private int id_usuario;
    private String login;
    private String senha;
    private String email;
    private String nome;
    private int id_categoria_usu;
    private int id_cliente;

    /**
     *
     * @param id_usuario
     * @param login
     * @param senha
     * @param email
     * @param nome
     * @param id_categoria_usu
     * @param id_cliente
     */
    public FL_Usuario(int id_usuario, String login, String senha, String email, String nome, int id_categoria_usu, int id_cliente) {
        this.id_usuario = id_usuario;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.id_categoria_usu = id_categoria_usu;
        this.id_cliente = id_cliente;
    }

    /**
     *
     * @return
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     *
     * @param id_usuario
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public int getId_categoria_usu() {
        return id_categoria_usu;
    }

    /**
     *
     * @param id_categoria_usu
     */
    public void setId_categoria_usu(int id_categoria_usu) {
        this.id_categoria_usu = id_categoria_usu;
    }

    /**
     *
     * @return
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     *
     * @param id_cliente
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id_usuario;
        hash = 59 * hash + (this.login != null ? this.login.hashCode() : 0);
        hash = 59 * hash + (this.senha != null ? this.senha.hashCode() : 0);
        hash = 59 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 59 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 59 * hash + this.id_categoria_usu;
        hash = 59 * hash + this.id_cliente;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FL_Usuario other = (FL_Usuario) obj;
        if (this.id_usuario != other.id_usuario) {
            return false;
        }
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        if ((this.senha == null) ? (other.senha != null) : !this.senha.equals(other.senha)) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if (this.id_categoria_usu != other.id_categoria_usu) {
            return false;
        }
        if (this.id_cliente != other.id_cliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FL_Usuario{" + "id_usuario=" + id_usuario + ", login=" + login + ", senha=" + senha + ", email=" + email + ", nome=" + nome + ", id_categoria_usu=" + id_categoria_usu + ", id_cliente=" + id_cliente + '}';
    }
    
    
    
}
