package com.company;

import java.util.Objects;

public class Ciudad implements Comparable<Ciudad>{
    private String codigo;
    private String nombre;


    public Ciudad(String codigo) {
        this.codigo= codigo;
    }

    public Ciudad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciudad ciudad= (Ciudad) o;
        return codigo.equals(persona.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "codigo='" + codigo + '\'' +
                ", nombre=" + nombre +
                '}';
    }



    @Override
    public int compareTo(Ciudad o) {
        return this.nombre.compareTo(o.nombre);
    }
}
