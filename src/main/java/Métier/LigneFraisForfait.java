package Métier;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class LigneFraisForfait extends AbstractLigneFrais {
    @Enumerated(EnumType.STRING)
    private FraisForfait frais_forfait;
    private int quantite;

    public float total() {
        return montant_unitaire() * quantite;
    }

    private float montant_unitaire() {
        switch(frais_forfait) {
            case ETAPE:
                return 110;
            case FRAISKM:
                return 0.62f;
            case NUITHOTEL:
                return 80;
            case RESTAU:
                return 25;
            default:
                return 0;
        }
    }

    public FraisForfait getFrais_forfait() {
        return frais_forfait;
    }

    public void setFrais_forfait(FraisForfait frais_forfait) {
        this.frais_forfait = frais_forfait;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
