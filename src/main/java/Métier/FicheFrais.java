package Métier;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Enum mapping : https://thorben-janssen.com/hibernate-enum-mappings/
 * TODO : Faire les méthodes ? total_frais_forfaitaire, total_frais_hors_forfait ?
 * TODO : Vérifier si la clé composée est fonctionnelle
 */
@Entity
public class FicheFrais implements Serializable {
    @Enumerated(EnumType.STRING)
    private Etat etat;

    @EmbeddedId
    private FicheFraisPK id;

    @ManyToOne
    @JoinColumn(name = "visiteur_id", insertable = false, updatable = false)
    Visiteur visiteur;
    private int nb_justificatifs;
    private float montant_valide;
    @Temporal(TemporalType.DATE)
    private Date date_modif;

    public FicheFraisPK getId() {
        return id;
    }

    public void setId(FicheFraisPK ident) {
        id = ident;
    }

    public Etat getEtat() {
        return etat;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur vst) {
        visiteur = vst;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public int getNb_justificatifs() {
        return nb_justificatifs;
    }

    public void setNb_justificatifs(int nb_justificatifs) {
        this.nb_justificatifs = nb_justificatifs;
    }

    public float getMontant_valide() {
        return montant_valide;
    }

    public void setMontant_valide(float montant_valide) {
        this.montant_valide = montant_valide;
    }

    public Date getDate_modif() {
        return date_modif;
    }

    public void setDate_modif(Date date_modif) {
        this.date_modif = date_modif;
    }
}
