
package Entidades;

/**
 * 
 * @author Pablo César
 */
public class Caballo {
    private String color, sonido, raza;
    private int edad;

    public Caballo() {
    }

    public Caballo(String color, String sonido, String raza, int edad) {
        this.color = color;
        this.sonido = sonido;
        this.raza = raza;
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Caballo{" + "color=" + color + ", sonido=" + sonido + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
}
