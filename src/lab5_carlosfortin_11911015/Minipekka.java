package lab5_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
public class Minipekka extends Carta{

    public Minipekka() {
        super();
    }

    public Minipekka(String objetivo, String velocidad, int coste, String rango) {
        super("Terrestres", "Alta", 4, "Especial");
    }
    
    @Override
    public String toString(){
        return "Minipekka"+": "+super.toString();
    }
    
}
