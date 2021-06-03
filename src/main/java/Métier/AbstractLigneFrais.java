package Métier;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractLigneFrais {
    @ManyToOne
    private FicheFrais fiche;
    @Id
    @GeneratedValue
    private int id;

    public FicheFrais getFiche() {
        return fiche;
    }

    public void setFiche(FicheFrais fiche) {
        this.fiche = fiche;
    }
}
