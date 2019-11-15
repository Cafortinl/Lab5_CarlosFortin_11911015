package lab5_carlosfortin_11911015;

import java.util.ArrayList;

/**
 *
 * @author Carlos Fortin
 */
public class Mazo {
    
    private ArrayList<Carta> cartas=new ArrayList();
    private int coste=(cartas.get(0).getCoste()+cartas.get(1).getCoste()+cartas.get(2).getCoste())/3;

    public Mazo() {
    }
    
    public Mazo(Carta carta1, Carta carta2, Carta carta3){
        
        if(cartas.size()<3){
            this.cartas.add(carta1);
            this.cartas.add(carta2);
            this.cartas.add(carta3);
        }
        
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
    public Carta getCarta(int pos){
        return this.cartas.get(pos);
    }
    
    public void setCarta(Carta carta){
        this.cartas.add(carta);
    }
    
    public String toString(){
        String salida="";
        for (Carta c : cartas) {
            salida+=cartas.indexOf(c)+"- "+c+"\n";
        }
        
        return salida;
    }
    
}
