package com.company;

import java.util.Objects;

//permite utilizar expresiones regulares para la validaciòn de cèdula
import java.util.regex.*;


public class Viajero implements Comparable<Viajero>{
    private String cedula;
    private String nombre;
    private int edad;
    TipoViajero tipo = new TipoViajero();

    public Viajero(String cedula) {
        this.cedula = cedula;
    }

    public Viajero(String unaCedula, String unNombre, int unaEdad, TipoViajero unTipo) {
        this.cedula = unaCedula;
        this.nombre = unNombre;
        this.edad = unaEdad;
        this.tipo = unTipo;
        //Validar();  ver las validaciones para tirar a consola segun error
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viajero viajero= (Viajero) o;
        return nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Viajero{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

//    @Override
//    public int compareTo(Viajero o) {
//        return this.edad - o.edad;
//    }

    @Override
    public int compareTo(Viajero o) {
        return this.nombre.compareTo(o.nombre);
    }



    private boolean Validar(){
        return (this.cedula.ValidarCedular() && this.nombre.ValidadNombre() && this.edad.ValidarEdad() && this.tipo.ValidarTipo());
    }


//Funciòn para validar la cédula

    private boolean ValidarCedula(String cedula) {

        // Expresión regular para validar cédula que tenga  formatos N.NNN.NNN-N o NNN.NNN-N
        String cadena = "^(\\d{1,3}\\.\\d{3}\\.\\d{3}-\\d{1}|\\d{3}\\.\\d{3}-\\d{1})$";

         return(cedula.matches(cadena);     //matches es una función de java que corrobora si una cadena coincide con una expresión regular.
        }

}
