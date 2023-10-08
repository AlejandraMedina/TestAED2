package sistema;

import interfaz.*;
import clases.*;
import grafo.*;

public class ImplementacionSistema implements Sistema {

    //Caso uso 01- iniciarSistema
    @Override
    public Retorno inicializarSistema(int maxCiudades) {

        if(maxCiudades > 5  ){
            viajeros = new ABB<Viajero>();
            ciudades = new Grafo<Ciudad>();
            Retorno.Resultado.OK;
        }
        else{
          Retorno.Resultado.ERROR;
        }
        Retorno.Resultado.NO_IMPLEMENTADA);
        }
    }

    @Override
    public Retorno registrarViajero(String cedula, String nombre, int edad, TipoViajero tipo) {

        //Nodo de viajero
        Viajero viajero = new Viajero(cedula,nombre, edad, tipo);

        if (viajeros.esVacia())
        {
            viajeros.agregarInicio(viajero);
            Retorno.Resultado.OK;
        }
        else
        {
            if ( !viajeros.existe(viajero) ) {
                //Agrega el viajero al final de la lista de viajeros para que quede en orden alfabetico.
                viajeros.insertar(viajero);
                Retorno.Resultado.OK;
            } else {
                r.resultado = Retorno.Resultado.ERROR_1;
            }
        }

        return Retorno.noImplementada();
    }

    @Override
    public Retorno buscarViajero(String cedula) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno listarViajerosAscendente() {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno listarViajerosDescendente() {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno listarViajerosPorTipo(TipoViajero tipo) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno registrarCiudad(String codigo, String nombre) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno registrarConexion(String codigoCiudadOrigen, String codigoCiudadDestino, int identificadorConexion, double costo, double tiempo, TipoConexion tipo) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno actualizarConexion(String codigoCiudadOrigen, String codigoCiudadDestino, int identificadorConexion, double costo, double tiempo, TipoConexion tipo) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno listadoCiudadesCantTrasbordos(String codigo, int cantidad) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno viajeCostoMinimo(String codigoCiudadOrigen, String codigoCiudadDestino) {
        return Retorno.noImplementada();
    }
}
