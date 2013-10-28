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
public class FL_Incidente {
    private int id_incidente;
    private String titulo;
    private String titulo_seo;
    private String descricao;
    private int id_subcategoria;

    /**
     *
     * @param id_incidente
     * @param titulo
     * @param titulo_seo
     * @param descricao
     * @param id_subcategoria
     */
    public FL_Incidente(int id_incidente, String titulo, String titulo_seo, String descricao, int id_subcategoria) {
        this.id_incidente = id_incidente;
        this.titulo = titulo;
        this.titulo_seo = titulo_seo;
        this.descricao = descricao;
        this.id_subcategoria = id_subcategoria;
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
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *
     * @return
     */
    public String getTitulo_seo() {
        return titulo_seo;
    }

    /**
     *
     * @param titulo_seo
     */
    public void setTitulo_seo(String titulo_seo) {
        this.titulo_seo = titulo_seo;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id_incidente;
        hash = 29 * hash + (this.titulo != null ? this.titulo.hashCode() : 0);
        hash = 29 * hash + (this.titulo_seo != null ? this.titulo_seo.hashCode() : 0);
        hash = 29 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 29 * hash + this.id_subcategoria;
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
        final FL_Incidente other = (FL_Incidente) obj;
        if (this.id_incidente != other.id_incidente) {
            return false;
        }
        if ((this.titulo == null) ? (other.titulo != null) : !this.titulo.equals(other.titulo)) {
            return false;
        }
        if ((this.titulo_seo == null) ? (other.titulo_seo != null) : !this.titulo_seo.equals(other.titulo_seo)) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (this.id_subcategoria != other.id_subcategoria) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FL_Incidente{" + "id_incidente=" + id_incidente + ", titulo=" + titulo + ", titulo_seo=" + titulo_seo + ", descricao=" + descricao + ", id_subcategoria=" + id_subcategoria + '}';
    }
    
    
    
}
