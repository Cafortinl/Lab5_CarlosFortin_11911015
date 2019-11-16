package lab5_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
public class Carta {
    
    private String nombre;
    private int daño;
    private int pts_vida;
    private String objetivo;
    private String velocidad;
    private int coste;
    private String rango;

    public Carta() {
    }

    public Carta(String nombre, int daño, int pts_vida, String objetivo, String velocidad, int coste, String rango) {
        this.nombre = nombre;
        this.daño = daño;
        this.pts_vida = pts_vida;
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.coste = coste;
        this.rango = rango;
    }

    public Carta(String objetivo, String velocidad, int coste, String rango) {
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.coste = coste;
        this.rango = rango;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getPts_vida() {
        return pts_vida;
    }

    public void setPts_vida(int pts_vida) {
        this.pts_vida = pts_vida;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    
    
    @Override
    public String toString(){
        return nombre+": "+rango;
    }
    
}
