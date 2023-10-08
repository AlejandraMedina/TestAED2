package sistema;

import interfaz.*;
import clases.*;
import grafo.*;

public class ImplementacionSistema implements Sistema {

    //Caso uso 01- iniciarSistema
    @Override
    public Retorno inicializarSistema(int maxCiudades) {

        Retorno r = new Retorno (Retorno.Resultado.NO_IMPLEMENTADA);

        if(maxCiudades > 5  ){
            viajeros = new ABB<Viajero>();
            ciudades = new Grafo<Ciudad>();
            r.resultado = Retorno.Resultado.OK;
        }
        else{
            r.resultado = Retorno.Resultado.ERROR;
        }
            return r;
        }
    }

    @Override
    public Retorno registrarViajero(String cedula, String nombre, int edad, TipoViajero tipo) {
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
