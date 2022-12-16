package fr.ipssi.architp1.paiement.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private long ID;
    private String nom;
    private String prenom;
    private String pseudo;
    private String mdp;
    private String dateNaissance;
    private String email;
    private long tel;
    private String status;
    //private String Rank;



    public void setID(long ref) {
        this.ID = ID;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public void setStatus(String status) {
        this.status = status;
    }




    public long getID() {
        return ID;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public long getTel() {
        return tel;
    }

    public String getStatus() {
        return status;
    }


}
