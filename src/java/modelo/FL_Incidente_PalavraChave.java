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
public class FL_Incidente_PalavraChave {
    private int id_incidente;
    private int id_palavraChave;

    /**
     *
     * @param id_incidente
     * @param id_palavraChave
     */
    public FL_Incidente_PalavraChave(int id_incidente, int id_palavraChave) {
        this.id_incidente = id_incidente;
        this.id_palavraChave = id_palavraChave;

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
    public int getId_palavraChave() {
        return id_palavraChave;
    }

    /**
     *
     * @param id_palavraChave
     */
    public void setId_palavraChave(int id_palavraChave) {
        this.id_palavraChave = id_palavraChave;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id_incidente;
        hash = 59 * hash + this.id_palavraChave;
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
        final FL_Incidente_PalavraChave other = (FL_Incidente_PalavraChave) obj;
        if (this.id_incidente != other.id_incidente) {
            return false;
        }
        if (this.id_palavraChave != other.id_palavraChave) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FL_Incidente_PalavraChave{" + "id_incidente=" + id_incidente + ", id_palavraChave=" + id_palavraChave + '}';
    }
    
    
}
