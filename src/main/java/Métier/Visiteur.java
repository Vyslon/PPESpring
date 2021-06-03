package Métier;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Temporal mapping : https://thorben-janssen.com/hibernate-jpa-date-and-time/
 */
@Entity
public class Visiteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String adresse;
    private String code_postal;
    private String ville;
    @Temporal(TemporalType.DATE)
    private Date date_embauche;
    @OneToMany(mappedBy = "visiteur")
    private List<FicheFrais> fichesFrais = new ArrayList<FicheFrais>();

    public Visiteur() {
        super();
    }

    public void addFicheFrais(FicheFrais ff) {
        fichesFrais.add(ff);
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Date getDate_embauche() {
        return date_embauche;
    }

    public void setDate_embauche(Date date_embauche) {
        this.date_embauche = date_embauche;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
