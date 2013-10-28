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
public class FL_PalavraChave {
    private int id_palavraChave;
    private String palavra;

    /**
     *
     * @param id_palavraChave
     * @param palavra
     */
    public FL_PalavraChave(int id_palavraChave, String palavra) {
        this.id_palavraChave = id_palavraChave;
        this.palavra = palavra;
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

    /**
     *
     * @return
     */
    public String getPalavra() {
        return palavra;
    }

    /**
     *
     * @param palavra
     */
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id_palavraChave;
        hash = 97 * hash + (this.palavra != null ? this.palavra.hashCode() : 0);
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
        final FL_PalavraChave other = (FL_PalavraChave) obj;
        if (this.id_palavraChave != other.id_palavraChave) {
            return false;
        }
        if ((this.palavra == null) ? (other.palavra != null) : !this.palavra.equals(other.palavra)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FL_PalavraChave{" + "id_palavraChave=" + id_palavraChave + ", palavra=" + palavra + '}';
    }
    
    
}
