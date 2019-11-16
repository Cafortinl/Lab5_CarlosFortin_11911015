package lab5_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
public class Gigante extends Carta{

    public Gigante() {
    }

    public Gigante(String objetivo, String velocidad, int coste, String rango) {
        super("Terrestres", "Media", 6, "Comun");
    }

    @Override
    public String toString() {
        return "Gigante"+": "+super.toString();
    }
    
    
    
}
