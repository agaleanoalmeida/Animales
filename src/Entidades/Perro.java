package Entidades;

import java.util.Date;


public class Perro {
 private String raza , nombre , color;
 private Date fechaNacimiento;
 private boolean castracion;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isCastracion() {
        return castracion;
    }

    public void setCastracion(boolean castracion) {
        this.castracion = castracion;
    }

    public Perro() {
    }

    public Perro(String raza, String nombre, String color, Date fechaNacimiento, boolean castracion) {
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
        this.fechaNacimiento = fechaNacimiento;
        this.castracion = castracion;
    }
 
 
 

}
