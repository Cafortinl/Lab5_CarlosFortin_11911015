package lab5_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
public class Dragon_Infernal extends Carta{

    public Dragon_Infernal() {
    }

    public Dragon_Infernal(String objetivo, String velocidad, int coste, String rango) {
        super("Aereos y Terrestres", "Media", 4, "Legendaria");
    }

    @Override
    public String toString() {
        return "Dragon Infernal"+": "+super.toString();
    }
    
    
    
}
