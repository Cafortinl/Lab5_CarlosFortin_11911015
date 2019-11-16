package lab5_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
public class Montapuerco extends Carta{

    public Montapuerco() {
        super();
    }

    public Montapuerco(String objetivo, String velocidad, int coste, String rango) {
        super("Terrestres", "Alta", 4, "Especial");
    }
    
    @Override
    public String toString(){
        return "Montapuerco"+": "+super.toString();
    }
    
}
