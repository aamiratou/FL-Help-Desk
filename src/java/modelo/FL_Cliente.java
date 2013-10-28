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
public class FL_Cliente {
    private int id_cliente;
    private String nome;
    private int CNPJ;
    private String email;

    /**
     *
     * @param id_cliente
     * @param nome
     * @param CNPJ
     * @param email
     */
    public FL_Cliente(int id_cliente, String nome, int CNPJ, String email) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.email = email;
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

    /**
     *
     * @return
     */
    public int getCNPJ() {
        return CNPJ;
    }

    /**
     *
     * @param CNPJ
     */
    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id_cliente;
        hash = 29 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 29 * hash + this.CNPJ;
        hash = 29 * hash + (this.email != null ? this.email.hashCode() : 0);
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
        final FL_Cliente other = (FL_Cliente) obj;
        if (this.id_cliente != other.id_cliente) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if (this.CNPJ != other.CNPJ) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FL_Cliente{" + "id_cliente=" + id_cliente + ", nome=" + nome + ", CNPJ=" + CNPJ + ", email=" + email + '}';
    }
    
    
}
