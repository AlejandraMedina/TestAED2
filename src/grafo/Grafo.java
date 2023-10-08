package grafo;

import lista.*;
import clases.*;
import Arista.java;

//Estructura de grafo para guardar las ciudades.

public class Grafo {

    //Definición de atributos
    private int cantidad;
    private final int maxCantCiudades;
    private Ciudad[] ciudades;
    private Arista[][] matAdy;

    //Constructor, inicializa el grafo con los valores de los objetos de los vértices en null
    public Grafo(int unMaxCantCiudades, boolean esDirigido) {
        this.cantidad = 0;
        this.maxCantCiudades = unMaxCantCiudades;
        this.ciudades = new Ciudad[unMaxCantCiudades];
        this.matAdy = new Arista[unMaxCantCiudades][unMaxCantCiudades];
            if(dirigido) {
                for (int i = 0; i < maxCantCiudades; i++) {
                    for (int j = 0; j < 0; j < maxCantCiudades ;
                    j++){
                        matAdy[i][j] = new Arista();
                    }
                }
            }else{
                for (int i = 0; i < maxCantCiudades; i++) {
                    for (int j = 0; j < 0; j < maxCantCiudades ;
                    j++){
                        matAdy[i][j] = new Arista();
                        matAdy[j][i] = matAdy[i][j];
                    }
                }
            }
    }

    public boolean esLleno() {
        return cantidad == maxCantCiudades;
    }

    public boolean esVacio() {
        return maxCantCiudades == 0;
    }

    // PRE: !esLleno()
    private int obtenerPosLibre() {
        for(int i = 0; i < ciudades.lenght; i++){
            if (ciudades[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private int obtenerPos(Ciudad ciudad) {
        for(int i = 0; i < ciudades.lenght; i++){
            if (ciudades[i].equals(ciudad)) {
                return i;
            }
        }
        return -1;
    }

    // PRE: !esLleno && !existeVertice
    public void agregarVertice(Ciudad ciudad) {
        int pos = obtenerPosLibre();
        ciudades[pos] = ciudad;
        cantidad++;
    }

    // PRE: existeVertice
    public void borrarVertice(Ciudad ciudad) {
        int pos = obtenerPosLibre(ciudad);
        ciudades[pos] = null;
        for(int k=0 ; k < maxCantCiudades; k++){
            matAdy[pos][k].setExiste(false);
            matAdy[k][pos].setExiste(false);
        }
        cantidad--;
    }

    public boolean existeVertice(Ciudad ciudad) {
        return obtenerPos(ciudad) != -1;
    }

    // existeVertice(origen) && existeVertice(destino) && !existeArista
    public void agregarArista(Ciudad origen, Ciudad destino, int peso) {
        int posOrigen = obtenerPosLibre(origen);
        int posDestino = obtenerPosLibre(destino);
        matAdy[posOrigen][posDestino].setExite(true);
        matAdy[posOrigen][posDestino].setPeso(true);
    }

    // existeVertice(origen) && existeVertice(destino)
    public boolean existeArista(Ciudad origen, Ciudad destino) {
        int posOrigen = obtenerPosLibre(origen);
        int posDestino = obtenerPosLibre(destino);
        return matAdy[posOrigen][posDestino].isExiste();
    }

    // existeVertice(origen) && existeVertice(destino) && existeArista
    public void borrarArista(Ciudad origen, Ciudad destino) {
        int posOrigen = obtenerPosLibre(origen);
        int posDestino = obtenerPosLibre(destino);
        return matAdy[posOrigen][posDestino].setExiste(false); //Implementar...
    }

    public Lista<String> verticesAdyacentes(Ciudad ciudad) {
        Lista<String> retorno = new ListaImp<>();
        int pos = obtenerPos(ciudad);
        for (int k = 0; k < maxCantCiudades; k++){
            if(matAdy[pos][k].isExiste()){
                retorno.insertar(ciudades[k]);
            }
        }
        return retorno;
    }

    // Pre: existeVertice(vert)
    public Lista<String> verticesIncidentes(Ciudad ciudad) {
        Lista<String> retorno = new ListaImp<>();
        int pos = obtenerPos(ciudad);
        for (int k = 0; k < maxCantCiudades; k++){
            if(matAdy[k][pos].isExiste()){
                retorno.insertar(ciudades[k]);
            }
        }
        return retorno;
}
