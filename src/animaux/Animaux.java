package animaux;
public class Animaux {
    private String espece;
    private String regime;
    private String habitat;
    private String bruit;
    private String sante;

    public void Lion(String espece, String regime, String habitat, String bruit){
        this.espece = espece;
        this.regime = regime;
        this.habitat = habitat;
        this.bruit = bruit;
    }

    public void Oiseaux(String espece, String regime, String habitat, String bruit){
        this.espece = espece;
        this.regime = regime;
        this.habitat = habitat;
        this.bruit = bruit;
    }

    public void Serpents(String espece, String regime, String habitat, String bruit){
        this.espece = espece;
        this.regime = regime;
        this.habitat = habitat;
        this.bruit = bruit;
    }

    public void Etat(String sante){
        this.sante = sante;
    }
}
