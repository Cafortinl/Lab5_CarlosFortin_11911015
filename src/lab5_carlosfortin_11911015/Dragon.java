package lab5_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
public class Dragon extends Carta{

    public Dragon() {
    }

    public Dragon(String nombre, String objetivo, String velocidad, int coste, String rango) {
        super("Aereos y Terrestres", "Media", 4, "Epica");
    }

    @Override
    public String toString() {
        return "Dragon"+": "+super.toString();
    }
    
    
    
}
