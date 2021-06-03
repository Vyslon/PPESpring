package Métier;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FicheFraisPK implements Serializable {
    @Column(name = "visiteur_id")
    long id;
    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    Mois mois;
    public FicheFraisPK() {

    }

    public FicheFraisPK(Visiteur vst, Mois ms) {
        this.id = vst.getId();
        this.mois = ms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FicheFraisPK)) return false;
        FicheFraisPK that = (FicheFraisPK) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(getMois(), that.getMois());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getMois());
    }

    public Mois getMois() {
        return mois;
    }

    public void setMois(Mois mois) {
        this.mois = mois;
    }
}