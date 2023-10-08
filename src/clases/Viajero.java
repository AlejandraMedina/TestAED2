package com.company;

import java.util.Objects;


public class Viajero implements Comparable<Viajero>{
    private String cedula;
    private String nombre;
    private int edad;
    TipoViajero tipo ;

    public Viajero(String cedula) {
        this.cedula = cedula;
    }

    public Viajero(String cedula, String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
}