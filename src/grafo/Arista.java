package grafo;

public class Arista {

    private boolean existe;
    private int peso;

    public Arista() {
        this.existe = false;
        this.peso = 0;
    }

    public Arista(int unPeso) {
        this.existe = true;
        this.peso = unPeso;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


}
