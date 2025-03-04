package enclo;
import animaux.Animaux;

public class Enclos {
    private String type;
    private int capacity;
    private int size;
    private String proprete;

    public void enclosLion(String type, int capacity, int size){
        this.type = type;
        this.capacity = capacity;
        this.size = size;
    }

    public void enclosGirrafe(String type, int capacity, int size){
        this.type = type;
        this.capacity = capacity;
        this.size = size;
    }

    public void enclosPenguin(String type, int capacity, int size){
        this.type = type;
        this.capacity = capacity;
        this.size = size;
    }

    public void proprete(String proprete){
        this.proprete = proprete;
    }
}
