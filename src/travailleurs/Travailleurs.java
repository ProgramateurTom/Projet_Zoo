package travailleurs;
public class Travailleurs {
    private String job;
    private String nom;
    private int age;
    private String specialite;

    public void Soigneur(String job, String nom, String specialite,int age) {
        this.job = job;
        this.nom = nom;
        this.specialite = specialite;
        this.age = age;
    }

    public void Nettoyeur(String job, String nom, int age) {
        this.job = job;
        this.nom = nom;
        this.age = age;
    }
}
