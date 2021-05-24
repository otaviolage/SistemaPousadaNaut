/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author mathe
 */
@Entity
public class Quartos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;
    @Column(name="Quarto")
    private String quarto;
    @Column(name="Tipo de Quarto")
    private int tpQuarto;

    public Quartos(int id, String quarto, int tpQuarto) {
        this.id = id;
        this.quarto = quarto;
        this.tpQuarto = tpQuarto;
    }
    
    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public int getTpQuarto() {
        return tpQuarto;
    }

    public void setTpQuarto(int tpQuarto) {
        this.tpQuarto = tpQuarto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quartos)) {
            return false;
        }
        Quartos other = (Quartos) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.jpa.Quartos[ id=" + id + " ]";
    }
    
}
