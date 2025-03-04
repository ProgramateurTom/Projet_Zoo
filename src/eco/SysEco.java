package eco;
import visiteurs.Visiteurs;

public class SysEco{
    private int prix_age;
    private int temp;
    private int paille;

    public void prix(int prix_age, int temp){
        this.prix_age = prix_age;
        this.temp = temp;
    }

    public void sallaire(int paille){
        this.paille = paille;
    }
}
