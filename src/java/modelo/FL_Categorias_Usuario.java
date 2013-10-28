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
public class FL_Categorias_Usuario {
    private int id_categoria_usu;
    private String nome;

    /**
     *
     * @param id_categoria_usu
     * @param nome
     */
    public FL_Categorias_Usuario(int id_categoria_usu, String nome) {
        this.id_categoria_usu = id_categoria_usu;
        this.nome = nome;
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
        int hash = 3;
        hash = 89 * hash + this.id_categoria_usu;
        hash = 89 * hash + (this.nome != null ? this.nome.hashCode() : 0);
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
        final FL_Categorias_Usuario other = (FL_Categorias_Usuario) obj;
        if (this.id_categoria_usu != other.id_categoria_usu) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FL_Categorias_Usuario{" + "id_categoria_usu=" + id_categoria_usu + ", nome=" + nome + '}';
    }
    
    
}
