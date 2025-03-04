package Spectacle;
import travailleurs.Travailleurs;
import animaux.Animaux;

import java.util.ArrayList;

public class spectacle {
    private String nom;
    private int nb_animaux;
    private ArrayList<Animaux> animaux = new ArrayList<Animaux>();

    public void spectacle(String nom, int nb_animaux) {
        this.nom = nom;
        this.nb_animaux = nb_animaux;
    }

    public void ajouterAnimaux(Animaux animaux) {
        this.animaux.add(animaux);
    }
    public void executionDuSpectacle(){
        for(Animaux animaux : animaux){
            animaux.bruit();
        }
    }

}
