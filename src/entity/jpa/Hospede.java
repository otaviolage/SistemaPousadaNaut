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
 * @author Otávio
 */
@Entity
public class Hospede implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;
    @Column(name="documentoHospede")
    private String documentoHospede;
    @Column(name="nomeHospede")
    private String nomeHospede;
    @Column(name="idadeHospede")
    private int idadeHospede;
    @Column(name="emailHospede")
    private String emailHospede;
    @Column(name="telefoneHospede")
    private String telefoneHospede;
    


    public Hospede(int id, String documentoHospede, String nomeHospede, int idadeHospede, String emailHospede, String telefoneHospede) {
        this.id = id;
        this.documentoHospede = documentoHospede;
        this.nomeHospede = nomeHospede;
        this.idadeHospede = idadeHospede;
        this.emailHospede = emailHospede;
        this.telefoneHospede = telefoneHospede;
    }

    public Hospede() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumentoHospede() {
        return documentoHospede;
    }

    public void setDocumentoHospede(String documentoHospede) {
        this.documentoHospede = documentoHospede;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public int getIdadeHospede() {
        return idadeHospede;
    }

    public void setIdadeHospede(int idadeHospede) {
        this.idadeHospede = idadeHospede;
    }

    public String getEmailHospede() {
        return emailHospede;
    }

    public void setEmailHospede(String emailHospede) {
        this.emailHospede = emailHospede;
    }

    public String getTelefoneHospede() {
        return telefoneHospede;
    }

    public void setTelefoneHospede(String telefoneHospede) {
        this.telefoneHospede = telefoneHospede;
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
        if (!(object instanceof Hospede)) {
            return false;
        }
        Hospede other = (Hospede) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.jpa.Hospede[ id=" + id + " ]";
    }
    
}
