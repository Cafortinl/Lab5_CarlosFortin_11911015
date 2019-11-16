package lab5_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
public class Leñador extends Carta{

    public Leñador() {
    }

    public Leñador(String objetivo, String velocidad, int coste, String rango) {
        super("Terrestres", "Alta", 4, "Legendaria");
    }

    @Override
    public String toString() {
        return "Leñador"+": "+super.toString();
    }
    
}
