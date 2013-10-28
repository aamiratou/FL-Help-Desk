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
public class FL_Sub_categoria {
    private int id_subcategoria;
    private String nome;
    private int id_categoria;

    /**
     *
     * @param id_subcategoria
     * @param nome
     * @param id_categoria
     */
    public FL_Sub_categoria(int id_subcategoria, String nome, int id_categoria) {
        this.id_subcategoria = id_subcategoria;
        this.nome = nome;
        this.id_categoria = id_categoria;
    }

    /**
     *
     * @return
     */
    public int getId_subcategoria() {
        return id_subcategoria;
    }

    /**
     *
     * @param id_subcategoria
     */
    public void setId_subcategoria(int id_subcategoria) {
        this.id_subcategoria = id_subcategoria;
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
    public int getId_categoria() {
        return id_categoria;
    }

    /**
     *
     * @param id_categoria
     */
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id_subcategoria;
        hash = 17 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 17 * hash + this.id_categoria;
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
        final FL_Sub_categoria other = (FL_Sub_categoria) obj;
        if (this.id_subcategoria != other.id_subcategoria) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if (this.id_categoria != other.id_categoria) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FL_Sub_categoria{" + "id_subcategoria=" + id_subcategoria + ", nome=" + nome + ", id_categoria=" + id_categoria + '}';
    }
    
    
}
