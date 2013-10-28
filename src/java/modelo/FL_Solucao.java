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
public class FL_Solucao {
    private int id_solucao;
    private String descricao;

    /**
     *
     * @param id_solucao
     * @param descricao
     */
    public FL_Solucao(int id_solucao, String descricao) {
        this.id_solucao = id_solucao;
        this.descricao = descricao;
    }

    /**
     *
     * @return
     */
    public int getId_solucao() {
        return id_solucao;
    }

    /**
     *
     * @param id_solucao
     */
    public void setId_solucao(int id_solucao) {
        this.id_solucao = id_solucao;
    }

    /**
     *
     * @return
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id_solucao;
        hash = 17 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
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
        final FL_Solucao other = (FL_Solucao) obj;
        if (this.id_solucao != other.id_solucao) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FL_Solucao{" + "id_solucao=" + id_solucao + ", descricao=" + descricao + '}';
    }
    
    
}
