ackage com.company;

public class ABB<T extends Comparable<T>> {

    private Nodo<T> raiz;

    public void insertar(T dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo<T>(dato);
        } else {
            insertarRec(raiz, dato);
        }
    }

    //pre nodo != null
    private void insertarRec(Nodo<T> nodo, T dato) {
        if (dato.compareTo(nodo.getDato()) > 0) {
            if (nodo.getDer() == null) {
                nodo.setDer(new Nodo<T>(dato));
            } else {
                insertarRec(nodo.getDer(), dato);
            }
        } else {
            if (nodo.getIzq() == null) {
                nodo.setIzq(new Nodo<T>(dato));
            } else {
                insertarRec(nodo.getIzq(), dato);
            }
        }
    }

    public boolean existe(T dato) {
        return existeRec(raiz, dato);
    }

    private boolean existeRec(Nodo<T> nodo, T dato) {
        if (nodo == null) {
            return false;
        } else if (nodo.getDato().equals(dato)) {
            return true;
        } else {
            if (dato.compareTo(nodo.getDato()) > 0) {
                return existeRec(nodo.getDer(), dato);
            } else {
                return existeRec(nodo.getIzq(), dato);
            }
        }
    }

    public T obtener(T dato) {
        return obtener(raiz, dato);
    }

    private T obtener(Nodo<T> nodo, T dato) {
        if (nodo == null) {
            return null;
        } else if (nodo.getDato().equals(dato)) {
            return nodo.getDato();
        } else {
            if (dato.compareTo(nodo.getDato()) > 0) {
                return obtener(nodo.getDer(), dato);
            } else {
                return obtener(nodo.getIzq(), dato);
            }
        }
    }

    public void listarAsc() {
        listarAsc(raiz);
    }

    private void listarAsc(Nodo<T> nodo) {
        if (nodo != null) {
            listarAsc(nodo.getIzq());
            System.out.println(nodo.getDato());
            listarAsc(nodo.getDer());
        }
    }

    public void listarDes() {
        listarDes(raiz);
    }

    private void listarDes(Nodo<T> nodo) {
        if (nodo != null) {
            listarDes(nodo.getDer());
            System.out.println(nodo.getDato());
            listarDes(nodo.getIzq());
        }
    }


}
