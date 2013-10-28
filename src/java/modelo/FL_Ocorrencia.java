/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Date;

/**
 *
 * @author Luiz
 */
public class FL_Ocorrencia {
 
    private int id_usuario;
    private int id_incidente;
    private Date data;

    /**
     *
     * @param id_usuario
     * @param id_incidente
     * @param data
     */
    public FL_Ocorrencia(int id_usuario, int id_incidente, Date data) {
        this.id_usuario = id_usuario;
        this.id_incidente = id_incidente;
        this.data = data;
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
    public Date getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id_usuario;
        hash = 53 * hash + this.id_incidente;
        hash = 53 * hash + (this.data != null ? this.data.hashCode() : 0);
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
        final FL_Ocorrencia other = (FL_Ocorrencia) obj;
        if (this.id_usuario != other.id_usuario) {
            return false;
        }
        if (this.id_incidente != other.id_incidente) {
            return false;
        }
        if (this.data != other.data && (this.data == null || !this.data.equals(other.data))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FL_Ocorrencia{" + "id_usuario=" + id_usuario + ", id_incidente=" + id_incidente + ", data=" + data + '}';
    }
    
    
}
