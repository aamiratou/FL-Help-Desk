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
public class FL_Incidente_Solucao {
    private int id_incidente;
    private int id_solucao;
    private int bom;
    private int ruim;

    /**
     *
     * @param id_incidente
     * @param id_solucao
     * @param bom
     * @param ruim
     */
    public FL_Incidente_Solucao(int id_incidente, int id_solucao, int bom, int ruim) {
        this.id_incidente = id_incidente;
        this.id_solucao = id_solucao;
        this.bom = bom;
        this.ruim = ruim;
    }

    /**
     *
     * @return
     */
    public int getId_incidente() {
        return id_incidente;
    }

    /**
     *
     * @param id_incidente
     */
    public void setId_incidente(int id_incidente) {
        this.id_incidente = id_incidente;
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
    public int getBom() {
        return bom;
    }

    /**
     *
     * @param bom
     */
    public void setBom(int bom) {
        this.bom = bom;
    }

    /**
     *
     * @return
     */
    public int getRuim() {
        return ruim;
    }

    /**
     *
     * @param ruim
     */
    public void setRuim(int ruim) {
        this.ruim = ruim;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id_incidente;
        hash = 97 * hash + this.id_solucao;
        hash = 97 * hash + this.bom;
        hash = 97 * hash + this.ruim;
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
        final FL_Incidente_Solucao other = (FL_Incidente_Solucao) obj;
        if (this.id_incidente != other.id_incidente) {
            return false;
        }
        if (this.id_solucao != other.id_solucao) {
            return false;
        }
        if (this.bom != other.bom) {
            return false;
        }
        if (this.ruim != other.ruim) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FL_Incidente_Solucao{" + "id_incidente=" + id_incidente + ", id_solucao=" + id_solucao + ", bom=" + bom + ", ruim=" + ruim + '}';
    }
    
    
}
