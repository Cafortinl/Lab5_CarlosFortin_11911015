package lab5_carlosfortin_11911015;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Carlos Fortin
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String nombre_usuario;
    private String password;
    private Date fecha_nacimiento;
    private int edad;
    private Color color_favorito;
    private Mazo mazo1;
    private Mazo mazo2;
    private Mazo mazo3;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String nombre_usuario, String password, Date fecha_nacimiento, Color color_favorito, Mazo mazo1, Mazo mazo2, Mazo mazo3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombre_usuario = nombre_usuario;
        this.password = password;
        this.fecha_nacimiento = fecha_nacimiento;
        this.color_favorito = color_favorito;
        this.mazo1 = mazo1;
        this.mazo2 = mazo2;
        this.mazo3 = mazo3;
    }

    public Usuario(String nombre, String apellido, String nombre_usuario, String password, Date fecha_nacimiento, Color color_favorito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombre_usuario = nombre_usuario;
        this.password = password;
        this.fecha_nacimiento = fecha_nacimiento;
        this.color_favorito = color_favorito;
        this.edad=(int) ((((new Date()).getTime()-(this.fecha_nacimiento).getTime())/((1000*60*60*24)))/365);
        this.mazo1 = new Mazo();
        this.mazo2 = new Mazo();
        this.mazo3 = new Mazo();
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor_favorito() {
        return color_favorito;
    }

    public void setColor_favorito(Color color_favorito) {
        this.color_favorito = color_favorito;
    }

    public Mazo getMazo1() {
        return mazo1;
    }

    public void setMazo1(Mazo mazo1) {
        this.mazo1 = mazo1;
    }

    public Mazo getMazo2() {
        return mazo2;
    }

    public void setMazo2(Mazo mazo2) {
        this.mazo2 = mazo2;
    }

    public Mazo getMazo3() {
        return mazo3;
    }

    public void setMazo3(Mazo mazo3) {
        this.mazo3 = mazo3;
    }
    
    @Override
    public String toString(){
        return nombre_usuario;
    }
    
}
